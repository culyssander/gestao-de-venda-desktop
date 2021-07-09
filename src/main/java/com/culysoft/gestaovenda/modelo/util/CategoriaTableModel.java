/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.util;

import com.culysoft.gestaovenda.modelo.entidades.Categoria;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author quitumba
 */
public class CategoriaTableModel extends AbstractTableModel {
    
    private List<Categoria> categorias;
    private String [] colunas = {"ID", "NOME", "DESCRICAO"};

    public CategoriaTableModel(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    

    @Override
    public int getRowCount() {
        return categorias.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Categoria categoria = categorias.get(linha);
        
        switch(coluna) {
            case 0: return categoria.getId();
            case 1: return categoria.getNome();
            case 2: return categoria.getDescricao();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column]; 
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; //To change body of generated methods, choose Tools | Templates.
    }
}
