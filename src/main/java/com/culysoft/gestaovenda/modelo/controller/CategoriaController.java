/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.controller;

import com.culysoft.gestaovenda.modelo.conexao.Conexao;
import com.culysoft.gestaovenda.modelo.conexao.ConexaoMysql;
import com.culysoft.gestaovenda.modelo.dao.CategoriaDao;
import com.culysoft.gestaovenda.modelo.entidades.Categoria;
import com.culysoft.gestaovenda.modelo.exception.NegocioException;
import com.culysoft.gestaovenda.modelo.util.CategoriaTableModel;
import com.culysoft.gestaovenda.view.formulario.Dashboard;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

/**
 *
 * @author quitumba
 */
public class CategoriaController implements ActionListener, MouseListener{
    
    private Conexao conexao;
    private Dashboard dashboard;
    private CategoriaDao categoriaDao;
    private CategoriaTableModel categoriaTableModel;
    private List<Categoria> categorias;
    private Categoria categoria;

    public CategoriaController(Dashboard dashboard) {
        this.conexao = new ConexaoMysql();
        this.categoriaDao = new CategoriaDao();
        this.dashboard = dashboard;
        actualizarTabelaCategoria(); 
        inicializarComboBoxCategoriaNoProduto();
    }
    
    private void inicializarComboBoxCategoriaNoProduto() {
        this.dashboard.getComboBoxProdutoCategoria().removeAllItems();
        this.dashboard.getComboBoxProdutoCategoria().addItem("Selecione a categoria");
        categorias.stream().forEach(c -> {
            this.dashboard.getComboBoxProdutoCategoria().addItem(c.getNome());
        });
    }    
    
    private void actualizarTabelaCategoria() {
        this.categorias = categoriaDao.todasCategorias();
        this.categoriaTableModel = new CategoriaTableModel(this.categorias);
        this.dashboard.getTabelaCategoria().setModel(categoriaTableModel);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String accao = ae.getActionCommand().toLowerCase();
        switch(accao) {
            case "salvar": salvar(); break;
            case "apagar": apagar(); break;
            case "limpar": limpar(); break;
            case "cancelar": cancelar(); break;
        }
        
    }

    private void salvar() {
        Categoria categoriaTemp = pegarValoresDoFormulario();
        
        String mensagem = categoriaDao.salvar(categoriaTemp);
        
        if(mensagem.startsWith("Categoria")) {
            mensagemNaTela(mensagem, Color.GREEN);
            
            actualizarTabelaCategoria();
            
            limpaCampos();
        } else {
            mensagemNaTela(mensagem, Color.RED);
        }
    }
    
    private void limpaCampos() {
        this.dashboard.getTxtCategoriaId().setText("0");
        this.dashboard.getTxtCategoriaNome().setText("");
        this.dashboard.getTxtCategoriaDescricao().setText("");
        this.categoria = null;
        actualizarTabelaCategoria();
        inicializarComboBoxCategoriaNoProduto();
    }
    
    private void validacaoDoCampo(String campo) {
        if(campo.isEmpty()) {
            String mensagem = "Deves preencher o campo nome";
            mensagemNaTela(mensagem, Color.RED);
            throw new NegocioException(mensagem);
        } 
    }
    
    private void mensagemNaTela(String mensagem, Color color) {
       this.dashboard.getLabelCategoriaMensagem().setText(mensagem);
        this.dashboard.getLabelCategoriaMensagem().setBackground(color);
    }
    
    private Categoria pegarValoresDoFormulario() {
        String idString = this.dashboard.getTxtCategoriaId().getText();
        String nome = this.dashboard.getTxtCategoriaNome().getText();
        String descricao = this.dashboard.getTxtCategoriaDescricao().getText();
        
        Long id = Long.valueOf(idString);
        
        validacaoDoCampo(nome);
        
        return new Categoria(id, nome, descricao);
    }
    
    private void preencherValoresNoFormulario() {
        this.dashboard.getTxtCategoriaId().setText(Long.toString(this.categoria.getId()));
        this.dashboard.getTxtCategoriaNome().setText(this.categoria.getNome());
        this.dashboard.getTxtCategoriaDescricao().setText(this.categoria.getDescricao());
    }

    private void apagar() {
        if (categoria != null) {
            String mensagem = categoriaDao.deleteCategoriaPeloId(this.categoria.getId());

            if(mensagem.startsWith("Categoria")) {
                mensagemNaTela(mensagem, Color.GREEN);
                limpaCampos();
            } else {
                mensagemNaTela(mensagem, Color.RED);
            }

        } else {
            mensagemNaTela("Deves selecionar um categoria na tabela", Color.RED);
        }
    }

    private void limpar() {
        limpaCampos();
        mensagemNaTela("", Color.WHITE);
    }

    private void cancelar() {
        this.dashboard.getDialogCategoria().setVisible(false);
        this.dashboard.getDialogProduto().setVisible(true);
        limpar();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int linhaSelecionada = this.dashboard.getTabelaCategoria().getSelectedRow();
        this.categoria = this.categoriaTableModel.getCategorias().get(linhaSelecionada);
        preencherValoresNoFormulario();
    }

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}

    
}
