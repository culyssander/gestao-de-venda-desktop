/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.controller;

import com.culysoft.gestaovenda.modelo.dao.AutenticacaoDao;
import com.culysoft.gestaovenda.modelo.util.AbstractMouseListener;
import com.culysoft.gestaovenda.modelo.dao.CategoriaDao;
import com.culysoft.gestaovenda.modelo.dao.ClienteDao;
import com.culysoft.gestaovenda.modelo.dao.ProdutoDao;
import com.culysoft.gestaovenda.modelo.dao.UsuarioDao;
import com.culysoft.gestaovenda.modelo.dao.VendaDao;
import com.culysoft.gestaovenda.modelo.entidades.Cliente;
import com.culysoft.gestaovenda.modelo.entidades.Produto;
import com.culysoft.gestaovenda.modelo.entidades.Usuario;
import com.culysoft.gestaovenda.modelo.entidades.Venda;
import com.culysoft.gestaovenda.modelo.entidades.VendaDetalhes;
import com.culysoft.gestaovenda.modelo.exception.NegocioException;
import com.culysoft.gestaovenda.modelo.util.VendaRegistroTableModel;
import com.culysoft.gestaovenda.modelo.util.VendaTableModel;
import com.culysoft.gestaovenda.view.formulario.Dashboard;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author quitumba
 */
public class VendaController extends AbstractMouseListener implements ActionListener, KeyListener {
    
    private Dashboard dashboard;
    private ProdutoDao produtoDao;
    private List<Produto> produtos;
    private CategoriaDao categoriaDao;
    private HashMap<String, VendaDetalhes> vendaDetalhesCesto;
    private VendaRegistroTableModel vendaRegistroTableModel;
    private Produto produto;
    private String nomeDoProduto;
    private AutenticacaoDao autenticacaoDao;
    private ClienteDao clienteDao;
    private UsuarioDao usuarioDao;
    private VendaDao vendaDao;
    private List<VendaDetalhes> vendaDetalhes;
    private VendaTableModel vendaTableModel;

    public VendaController(Dashboard dashboard) {
        this.dashboard = dashboard;
        produtoDao = new ProdutoDao();
        produtos = produtoDao.todosProdutos();
        inicializarCategoria();
        this.vendaDetalhesCesto = new HashMap<>();
        actualizarCesto(vendaDetalhesCesto);
        autenticacaoDao = new AutenticacaoDao();
        usuarioDao = new UsuarioDao();
        clienteDao = new ClienteDao();
        vendaDao = new VendaDao();
        actualizarTabelaVenda();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String accao = ae.getActionCommand().toLowerCase();
        
        switch(accao) {
            case "adicionar": mostrarTelaRegistro(); break;
            case "comboboxvendacategoria": pesquisarProdutoPeloCategoria(); break;
            case "comboboxvendaproduto": selecionarProdutoNaComboBox(); break;
            case "adicionarnocesto": adicionarProdutoNoCesto(); break;
            case "checkboxvendadesconto": ativaCheckBoxDesconto(); break;
            case "remover": removerProdutoNoCesto(); break;
            case "vender": vender(); break;
            case "cancelar": cancelar(); break;
            case "detalhes": detalhes(); break;
        }
    }

    private void mostrarTelaRegistro() {
        this.dashboard.getDialogVenda().pack();
        this.dashboard.getDialogVenda().setLocationRelativeTo(dashboard);
        this.dashboard.getDialogVenda().setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {
        String pesquisar = this.dashboard.getTxtVendaPesquisarProduto().getText();
        Optional<Produto> produtosTemp = produtos.stream()
                .filter((p) -> {
                    return p.getId().toString().equals(pesquisar)
                            || p.getNome().equalsIgnoreCase(pesquisar);
                })
                .findFirst();

        if (produtosTemp.isPresent()) {
            this.produto = produtosTemp.get();
            detalhesDoProduto();
        } else {
            informacaoPadraoDaLabelVendaProduto();
        }
    }
    
    private void detalhesDoProduto() {
        this.dashboard.getLabelVendaPrecoDoProduto().setText(this.produto.getPreco().toString());
        this.dashboard.getLabelVendaQuantidadeDoProduto().setText(this.produto.getQuantidade().toString());
        this.dashboard.getLabelVendaNomedeDoProduto().setText(produto.getNome());
    }
    
    private void informacaoPadraoDaLabelVendaProduto() {
        this.dashboard.getLabelVendaPrecoDoProduto().setText("0,00");
        this.dashboard.getLabelVendaQuantidadeDoProduto().setText("0");
        this.dashboard.getLabelVendaNomedeDoProduto().setText("");
        this.produto = null;
    }
    
    private void inicializarCategoria() {
        categoriaDao = new CategoriaDao();
        
        this.dashboard.getComboBoxVendaPesquisarProdutoPelaCategoria().removeAllItems();
        this.dashboard.getComboBoxVendaPesquisarProdutoPelaCategoria().addItem("Selecione");
        
        inicializarProduto();
        
        categoriaDao.todasCategorias()
                .stream()
                .forEach(c -> this.dashboard.getComboBoxVendaPesquisarProdutoPelaCategoria()
                              .addItem(c.getNome()));
        
    }
    
    private void inicializarProduto() {
        this.dashboard.getComboBoVendaProduto().removeAllItems();
        this.dashboard.getComboBoVendaProduto().addItem("Selecione");
    }

    private void pesquisarProdutoPeloCategoria() {
        inicializarProduto();
        String categoria = this.dashboard.getComboBoxVendaPesquisarProdutoPelaCategoria().getSelectedItem().toString();
        
        if(!categoria.equals("Selecione")) {
            List<Produto> produtosTemp = produtoDao.buscarProdutosPeloCategoria(categoria);
            produtosTemp
                    .stream()
                    .forEach(p -> this.dashboard.getComboBoVendaProduto().addItem(p.getNome()));
        }        
    }

    private void selecionarProdutoNaComboBox() {
        if(this.dashboard.getComboBoVendaProduto().getSelectedIndex() > 0) {
            String produtoSelecionado = this.dashboard.getComboBoVendaProduto().getSelectedItem().toString();
            this.produto = produtoDao.buscarProdutoPeloNome(produtoSelecionado);
            if(produto != null)
                detalhesDoProduto();
        }
    }
    
    private void validacaoDoCampo(String campo, String nomeDaVariavel) {
        if(campo.isEmpty()) {
            String mensagem = String.format("Deves preencher o campo %s", nomeDaVariavel);
            mensagemNaTela(mensagem, Color.RED);
            throw new NegocioException(mensagem);
        }
    }
    
    
    private void validacaoDaQuantidade(Integer quantidade) {
        if(quantidade <= 0) {
            String mensagem = String.format("Quantidade nao pode ser um numero negativo ou menor que zero");
            mensagemNaTela(mensagem, Color.RED);
            throw new NegocioException(mensagem);
        }
    }
    
    private void validacaoDoQuantidadeDoProdutoMaiorQueSolicitado(int quantidade) {
        if(this.produto.getQuantidade() < quantidade) {
            mensagemNaTela("Quantidade indisponivel", Color.RED);
            throw new NegocioException("Quantidade indisponivel");
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
    
    private void mensagemNaTela(String mensagem, Color color) {
         this.dashboard.getLabelVendaMensagem().setBackground(color);
         this.dashboard.getLabelVendaMensagem().setText(mensagem);
    }

    private void adicionarProdutoNoCesto() {
        if(produto != null) {
            int quantidadeExistente = 0;
            
            if(vendaDetalhesCesto.containsKey(this.produto.getNome())) {
                quantidadeExistente = vendaDetalhesCesto.get(this.produto.getNome()).getQuantidade();
            }
            
            VendaDetalhes vendaDetalhesTemp  = new VendaDetalhes();
            String quantidadeString = this.dashboard.getTxtVendaQuantidade().getValue().toString();
            String descontoString = this.dashboard.getTxtVendaDesconto().getText();
            
            validacaoDoCampo(quantidadeString, "quantidade");
            validacaoDoCampo(descontoString, "desconto");
            
            Integer quantidade = validacaoDaQuantidadeSeENumero(quantidadeString);
            quantidade += quantidadeExistente;
            
            validacaoDaQuantidade(quantidade);
            validacaoDoQuantidadeDoProdutoMaiorQueSolicitado(quantidade);
            
            BigDecimal desconto = validacaoDaPrecoSeENumero(descontoString);
            BigDecimal total = this.produto.getPreco().subtract(desconto)
                    .multiply(BigDecimal.valueOf((quantidade)));
            
            
            vendaDetalhesTemp.setProduto(this.produto);
            vendaDetalhesTemp.setQuantidade(quantidade);
            vendaDetalhesTemp.setDesconto(desconto.multiply(BigDecimal.valueOf(quantidade)));
            vendaDetalhesTemp.setTotal(total);
            
            this.vendaDetalhesCesto.put(this.produto.getNome(), vendaDetalhesTemp);
            
            actualizarCesto(vendaDetalhesCesto);
            actualizarTotalDaVenda();
            
        } else {
            mensagemNaTela("Nao tem produto selecionado", Color.RED);
        }
    }
    
    private void actualizarCesto(HashMap<String, VendaDetalhes> vendaDetalhess) {
        this.vendaRegistroTableModel = new VendaRegistroTableModel(vendaDetalhess);
        this.dashboard.getTabelaVendaRegistro().setModel(vendaRegistroTableModel);
    }
    
    private void actualizarTotalDaVenda() {
        double totalVenda = this.vendaDetalhesCesto.values()
                .stream()
                .collect(Collectors.summingDouble(v -> v.getTotal().doubleValue()));
        
        double totalDesconto = this.vendaDetalhesCesto.values()
                .stream()
                .collect(Collectors.summingDouble(v -> v.getDesconto().doubleValue()));
        
        this.dashboard.getLabelVendaTotalDaVenda().setText(new BigDecimal(totalVenda).toString());
        this.dashboard.getLabelVendaTotalDoDesconto().setText(new BigDecimal(totalDesconto).toString());
    }

    private void removerProdutoNoCesto() {
        if(this.nomeDoProduto != null && !this.nomeDoProduto.isEmpty()) {
            this.vendaDetalhesCesto.remove(this.nomeDoProduto);
            actualizarTotalDaVenda();
            actualizarCesto(this.vendaDetalhesCesto);
        }else{
            mensagemNaTela("Deves selecionar o produto que desejas remover", Color.RED);
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        try {
            int linhaSelecionadaVenda = this.dashboard.getTabelaVenda().getSelectedRow();
            Long idVenda = this.vendaTableModel.getVendas().get(linhaSelecionadaVenda).getId();
            this.vendaDetalhes = this.vendaDao.buscaDetalhesDaVendaPeloId(idVenda);
        } catch (Exception e) {
            System.out.println(String.format("Error: ", e));
        }
        try {
            int linhaSelecionada = this.dashboard.getTabelaVendaRegistro().getSelectedRow();
            this.nomeDoProduto = (String) this.dashboard.getTabelaVendaRegistro().getModel().getValueAt(linhaSelecionada, 0);
            
        } catch (Exception e) {
            System.out.println(String.format("Error registro: %s", e));
        }
    }
    
    private Usuario usuarioLogado() {
        Long usuarioLogadoId = Long.valueOf(this.dashboard.getLabelUsuarioLogadoId().getText());
        return usuarioDao.buscarUsuarioPeloId(usuarioLogadoId);
    }

    private void ativaCheckBoxDesconto() {
        if(this.autenticacaoDao.temPermissao(usuarioLogado()) && this.dashboard.getCheckBoxVendaDesconto().isSelected()) {
            this.dashboard.getTxtVendaDesconto().setEditable(true);
        } else {
            this.dashboard.getTxtVendaDesconto().setEditable(false);
        }
    }

    private void vender() {
        Cliente cliente = new Cliente();
        String valoPagoString = this.dashboard.getTxtVendaValorPago().getText();
        String totalDaVendaString = this.dashboard.getLabelVendaTotalDaVenda().getText();
        String descontoTotalString = this.dashboard.getLabelVendaTotalDoDesconto().getText();
        String trocoString = this.dashboard.getLabelVendaTroco().getText();
        String idString = this.dashboard.getTxtVendaId().getText();
        String idClienteString = this.dashboard.getTxtVendaCliente().getText();
                
        BigDecimal valorPago = validacaoDaPrecoSeENumero(valoPagoString);
        BigDecimal totalDaVenda = validacaoDaPrecoSeENumero(totalDaVendaString);
        BigDecimal descontoTotal = new BigDecimal(descontoTotalString);
        BigDecimal troco = new BigDecimal(trocoString);
        
        Long id = Long.valueOf(idString);
        
        if(vendaDetalhesCesto.isEmpty()) {
            mensagemNaTela("Nao ha produtos na lista", Color.RED);
            throw new NegocioException("Nao ha produtos na lista");
        }
        
        validacaoDoCampo(valoPagoString, "valor pago");
        validacaoDoCampo(idClienteString, "buscar cliente");        
        
        if(valorPago.doubleValue() >= totalDaVenda.doubleValue()) {
            try {
                Long idCliente = Long.valueOf(idClienteString);
                System.out.println("ID: " + idCliente);
                cliente = clienteDao.buscarClientePeloId(idCliente);
                
                if (cliente == null) {
                    mensagemNaTela(String.format("Cliente com id %d nao existe. Insira o nome do cliente para registar", idCliente), Color.RED);
                    throw new NegocioException("Cliente com id nao existe");
                }
            } catch (NumberFormatException e) {
                cliente.setId(0L);
                cliente.setNome(idClienteString);
                System.out.println(cliente);
                clienteDao.salvar(cliente);
                cliente = clienteDao.buscarUltimoCliente();
            }
            
            troco = valorPago.subtract(totalDaVenda);

            Venda venda = new Venda(id, cliente, usuarioLogado(), totalDaVenda, valorPago, troco, descontoTotal, LocalDateTime.now(), LocalDateTime.now(), vendaDetalhesCesto);
            System.out.println(venda);
            String mensagem = vendaDao.salvar(venda);
            
            if(mensagem.startsWith("Venda")) {
                this.dashboard.getLabelVendaValorPago().setText(valorPago.toString());
                this.dashboard.getLabelVendaTroco().setText(troco.toString());
                mensagemNaTela(mensagem, Color.GREEN);
                actualizarTabelaVenda();
                this.dashboard.getLabelHomeCliente().setText(String.format("%d", clienteDao.todosCliente().size()));
                limparCampo();
            } else {
                mensagemNaTela(mensagem, Color.RED);
            }
        }else {
            mensagemNaTela("Valor pago nao pode ser menor que o total da venda", Color.RED);
        }
        
    }
    
    private void actualizarTabelaVenda() {
        List<Venda> vendas = vendaDao.todosVendas();
        this.vendaTableModel = new VendaTableModel(vendas);
        this.dashboard.getTabelaVenda().setModel(vendaTableModel);
        this.dashboard.getLabelHomeVenda().setText(String.format("%d", vendas.size()));
    }

    private void cancelar() {
        limparCampo();
        this.dashboard.getDialogVenda().setVisible(false);
    }

    private void detalhes() {
        if(this.vendaDetalhes != null) {
            StringBuilder produtoDaVenda = new StringBuilder();
            
            vendaDetalhes.stream().forEach(v -> {
                produtoDaVenda.append(String.format("%s - ", v.getProduto().getNome()));
                produtoDaVenda.append(String.format("%f - ", v.getProduto().getPreco().setScale(2, RoundingMode.DOWN)));
                produtoDaVenda.append(String.format("%d - ", v.getQuantidade()));
                produtoDaVenda.append(String.format("%f - ", v.getDesconto().setScale(2, RoundingMode.DOWN)));
                produtoDaVenda.append(String.format("%f  ", v.getTotal().setScale(2, RoundingMode.DOWN)));
                produtoDaVenda.append("\n");
            });
            
            JOptionPane.showMessageDialog(dashboard, 
                String.format("Detalhes da venda com id: %d \n\n"
                        + "__________________________________________\n"
                        + "Nome do cliente: %s \n"
                        + "Total da venda: %s \n"
                        + "Data da venda: %s \n"
                        + "Vendido por: %s \n"
                        + "__________________________________________\n"
                        + "Produto - Preco - Quantidade - Desconto - Total \n"
                        + "__________________________________________\n"
                        + "%s", 
                      this.vendaDetalhes.get(0).getVenda().getId(),
                      this.vendaDetalhes.get(0).getVenda().getCliente().getNome(),
                      this.vendaDetalhes.get(0).getVenda().getTotalVenda(),
                      this.vendaDetalhes.get(0).getVenda().getDataHoraCriacao(),
                      this.vendaDetalhes.get(0).getVenda().getUsuario().getNome(),
                      produtoDaVenda.toString()
                )
            );
        }else {
            JOptionPane.showMessageDialog(dashboard, "Seleciona um elemento na tabela", "Sem venda selecionada", 0);
        }
    }
    
    private void limparCampo() {
        this.dashboard.getTxtVendaQuantidade().setValue(1);
        this.dashboard.getTxtVendaDesconto().setText("1");
        this.dashboard.getTxtVendaValorPago().setText("");
        this.dashboard.getTxtVendaPesquisarProduto().setText("");
        this.dashboard.getTxtVendaId().setText("0");
        this.dashboard.getTxtVendaCliente().setText("");
        this.vendaDetalhesCesto = new HashMap<>();
        this.produto = null;
    }
}
