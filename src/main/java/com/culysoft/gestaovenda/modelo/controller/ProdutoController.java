/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.controller;

import com.culysoft.gestaovenda.modelo.conexao.Conexao;
import com.culysoft.gestaovenda.modelo.conexao.ConexaoMysql;
import com.culysoft.gestaovenda.modelo.dao.AutenticacaoDao;
import com.culysoft.gestaovenda.modelo.dao.CategoriaDao;
import com.culysoft.gestaovenda.modelo.dao.ProdutoDao;
import com.culysoft.gestaovenda.modelo.dao.UsuarioDao;
import com.culysoft.gestaovenda.modelo.entidades.Categoria;
import com.culysoft.gestaovenda.modelo.entidades.Produto;
import com.culysoft.gestaovenda.modelo.entidades.Usuario;
import com.culysoft.gestaovenda.modelo.exception.NegocioException;
import com.culysoft.gestaovenda.modelo.util.ProdutoTableModel;
import com.culysoft.gestaovenda.view.formulario.Dashboard;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author quitumba
 */
public class ProdutoController implements ActionListener, MouseListener, KeyListener {
    
    private final Conexao conexao;
    private final Dashboard dashboard;
    private final AutenticacaoDao autenticacaoDao;
    private final UsuarioDao usuarioDao;
    private final CategoriaDao categoriaDao;
    private final ProdutoDao produtoDao;
    private ProdutoTableModel produtoTableModel;
    private Produto produto;
   
    public ProdutoController(Dashboard dashboard) {
        this.conexao = new ConexaoMysql();
        this.usuarioDao = new UsuarioDao();
        this.autenticacaoDao = new AutenticacaoDao();
        this.dashboard = dashboard;
        this.categoriaDao = new CategoriaDao();
        this.produtoDao = new ProdutoDao();
        actualizarTabela(produtoDao.todosProdutos());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String accao = ae.getActionCommand().toLowerCase();
        
        switch(accao) {
            case "adicionar": adicionar(); break;
            case "editar": editar(); break;
            case "apagar": apagar(); break;
            case "adicionarcategoria": mostrarTelaCategoria(); break;
            case "salvar": salvar(); break;
            case "cancelar": cancelar(); break;
        }
    }

    private void adicionar() {
        Usuario usuario = usuarioLogado();
        if(autenticacaoDao.temPermissao(usuario))
            mostrarTelaProduto();
    }
    
    private Usuario usuarioLogado() {
        Long usuarioLogadoId = Long.valueOf(this.dashboard.getLabelUsuarioLogadoId().getText());
        return usuarioDao.buscarUsuarioPeloId(usuarioLogadoId);
    }
    
    private void mostrarTelaProduto() {
        this.dashboard.getDialogProduto().pack();
        this.dashboard.getDialogProduto().setLocationRelativeTo(dashboard);
        this.dashboard.getDialogProduto().setVisible(true);
    }

    private void mostrarTelaCategoria() {
        this.dashboard.getDialogCategoria().pack();
        this.dashboard.getDialogCategoria().setLocationRelativeTo(dashboard);
        this.dashboard.getDialogCategoria().setVisible(true);
        ocultaTelaProduto();
    }
    
    private void ocultaTelaProduto() {
        this.dashboard.getDialogProduto().setVisible(false);
    }
    
    private void validacaoDoCampo(String campo, String nomeDaVariavel) {
        if(campo.isEmpty()) {
            String mensagem = String.format("Deves preencher o campo %s", nomeDaVariavel);
            mensagemNaTela(mensagem, Color.RED);
            throw new NegocioException(mensagem);
        }
    }
    
    private void validacaoDaQuantidade(Integer quantidade) {
        if(quantidade < 0) {
            String mensagem = String.format("Quantidade nao pode ser um numero negativo(Menor que zero) ");
            mensagemNaTela(mensagem, Color.RED);
            throw new NegocioException(mensagem);
        }
    }
    
    private void validacaoDoPreco(BigDecimal preco) {
        if(preco.doubleValue() < 1) {
            String mensagem = String.format("Preco nao pode ser menor que zero ");
            mensagemNaTela(mensagem, Color.RED);
            throw new NegocioException(mensagem);
        }
    }
    
    private void validacaoDaCategoria() {
        if(this.dashboard.getComboBoxProdutoCategoria().getSelectedIndex() == 0) {
            String mensagem = "Deves preencher o perfil";
            mensagemNaTela(mensagem, Color.RED);
            throw new NegocioException(mensagem);
        }
    }
    
    private Integer validacaoDaQuantidadeSeENumero(String quantidadeString) {
        try {
            Integer quantidade = Integer.valueOf(quantidadeString);
            return quantidade;
        } catch (NumberFormatException e) {
            mensagemNaTela("Deves inserir apenas numero.", Color.RED);
            return 0;
        }
    }
    
    private BigDecimal validacaoDaPrecoSeENumero(String precoString) {
        try {
            BigDecimal preco = new BigDecimal(precoString);
            return preco;
        } catch (Exception e) {
            mensagemNaTela("Deves inserir apenas numero.", Color.RED);
            return BigDecimal.ONE;
        }
    }
    
    private Produto pegarValoresDoFormulario() {
        Usuario usuario = usuarioLogado();
        
        String idString = this.dashboard.getTxtProdutoId().getText();
        String nome = this.dashboard.getTxtProdutoNome().getText();
        String descricao = this.dashboard.getTxtProdutoDescricao().getText();
        String precoString = this.dashboard.getTxtProdutoPreco().getText();
        String quantidadeString = this.dashboard.getTxtProdutoQuantidade().getValue().toString();
        String categoriaTemp = this.dashboard.getComboBoxProdutoCategoria().getSelectedItem().toString();
               
        validacaoDoCampo(nome, "nome");
        validacaoDoCampo(precoString, "preco");
        validacaoDoCampo(quantidadeString, "quantidade");
        validacaoDaCategoria();
        
        Long id = Long.valueOf(idString);
        Integer quantidade = validacaoDaQuantidadeSeENumero(quantidadeString);
        BigDecimal preco = validacaoDaPrecoSeENumero(precoString);
        Categoria categoria = categoriaDao.buscarCategoriaPeloNome(categoriaTemp);
        
        validacaoDaQuantidade(quantidade);
        validacaoDoPreco(preco);
        
                
        return new Produto(id, nome, descricao, preco, categoria, quantidade, usuario, null);
    }

    private void salvar() {
        Produto produtoTemp = pegarValoresDoFormulario();
        
        String mensagem = produtoDao.salvar(produtoTemp);
        
        if(mensagem.startsWith("Produto")) {
            mensagemNaTela(mensagem, Color.GREEN);
            limpaCampo();
        }else {
            mensagemNaTela(mensagem, Color.RED);
        }
    }

    private void cancelar() {
        this.dashboard.getDialogProduto().setVisible(false);
        limpaCampo();
        mensagemNaTela("", Color.WHITE);
    }

    private void mensagemNaTela(String mensagem, Color color) {
         this.dashboard.getLabelProdutoMensagem().setBackground(color);
         this.dashboard.getLabelProdutoMensagem().setText(mensagem);
    }
    
    private void limpaCampo() {
        this.dashboard.getTxtProdutoId().setText("0");
        this.dashboard.getTxtProdutoNome().setText("");
        this.dashboard.getTxtProdutoDescricao().setText("");
        this.dashboard.getTxtProdutoPreco().setText("1");
        this.dashboard.getTxtProdutoQuantidade().setValue(0);
        this.dashboard.getComboBoxProdutoCategoria().setSelectedIndex(0);
        actualizarTabela(produtoDao.todosProdutos());
        this.produto = null;
    }
    
    private void actualizarTabela(List<Produto> produtos) {
        this.produtoTableModel = new ProdutoTableModel(produtos);
        this.dashboard.getTabelaProduto().setModel(produtoTableModel);
        this.dashboard.getLabelHomeProduto().setText(String.format("%d", produtos.size()));
    }

    private void editar() {
        Usuario usuario = usuarioLogado();
        if(autenticacaoDao.temPermissao(usuario)){
            if(this.produto != null) {
                mostrarTelaProduto();
            } else {
                JOptionPane.showMessageDialog(dashboard, "Deves selecionar um produto na tabela", "Seleciona um produto", 0);
            }
        }
    }

    private void apagar() {
        Usuario usuario = usuarioLogado();
        if(autenticacaoDao.temPermissao(usuario)){
            if(this.produto != null) {
                int confirmar = JOptionPane.showConfirmDialog(dashboard, 
                        String.format("Tens certeza que desejas apagar? \nNome: %s", this.produto.getNome()), 
                        "Apagar produto", JOptionPane.YES_NO_OPTION);
                
                    if(confirmar == JOptionPane.YES_OPTION) {
                        String mensagem = produtoDao.deletaProdutoPeloId(this.produto.getId());
                        JOptionPane.showMessageDialog(dashboard, mensagem);
                        limpaCampo();
                    }
            } else {
                JOptionPane.showMessageDialog(dashboard, "Deves selecionar um produto na tabela", "Seleciona um produto", 0);
            }
        }
    }

    private void preencherOsValoresNoFormulario() {
        this.dashboard.getTxtProdutoId().setText(Long.toString(this.produto.getId()));
        this.dashboard.getTxtProdutoNome().setText(this.produto.getNome());
        this.dashboard.getTxtProdutoDescricao().setText(this.produto.getDescricao());
        this.dashboard.getTxtProdutoPreco().setText(this.produto.getPreco().toString());
        this.dashboard.getTxtProdutoQuantidade().setValue(this.produto.getQuantidade());
        this.dashboard.getComboBoxProdutoCategoria().setSelectedItem(this.produto.getCategoria().getNome());
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int linhaSelecionada = this.dashboard.getTabelaProduto().getSelectedRow();
        this.produto = this.produtoTableModel.getProdutos().get(linhaSelecionada);
        preencherOsValoresNoFormulario();
    }

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {
        String pesquisar = this.dashboard.getTxtProdutoPesquisar().getText();
        
        if(pesquisar.isEmpty()) {
            actualizarTabela(produtoDao.todosProdutos());
        } else {
            List<Produto> produtoTemp = this.produtoDao.todosProdutos()
                    .stream()
                    .filter((Produto p) -> {
                        return p.getNome().toLowerCase().contains(pesquisar.toLowerCase()) || 
                                p.getCategoria().getNome().toLowerCase().contains(pesquisar.toLowerCase());
                    })
                    .collect(Collectors.toList());
            
            actualizarTabela(produtoTemp);
        }
    }
}
