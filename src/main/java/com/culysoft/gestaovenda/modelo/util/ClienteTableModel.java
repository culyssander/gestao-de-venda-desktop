/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.util;

import com.culysoft.gestaovenda.modelo.entidades.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author quitumba
 */
public class ClienteTableModel extends AbstractTableModel{
    
    private List<Cliente> clientes;
    private String [] colunas = {"ID", "NOME", "TELEFONE", "ENDERECO"};

    public ClienteTableModel(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Cliente cliente = clientes.get(linha);
        
        switch(coluna) {
            case 0: return cliente.getId();
            case 1: return cliente.getNome();
            case 2: return cliente.getTelefone();
            case 3: return cliente.getEndereco();
            default: return "";
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    
    
    
    
}
