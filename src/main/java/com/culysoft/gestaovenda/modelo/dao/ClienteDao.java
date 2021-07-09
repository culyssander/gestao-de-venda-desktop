/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.dao;

import com.culysoft.gestaovenda.modelo.conexao.Conexao;
import com.culysoft.gestaovenda.modelo.conexao.ConexaoMysql;
import com.culysoft.gestaovenda.modelo.entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quitumba
 */
public class ClienteDao {
    
    private final Conexao conexao;

    public ClienteDao() {
        this.conexao = new ConexaoMysql();
    }
    
    public String salvar(Cliente cliente) {
        
        if(cliente.getId() == 0L) {
            String sql = "INSERT INTO cliente(nome, telefone, morada) VALUES (?, ?, ?)";
            return registar(cliente, sql);
        }else{
            String sql = "UPDATE cliente SET nome = ?, telefone = ?, morada = ? WHERE id = ?";
            return registar(cliente, sql);
        }
    }
    
    private String registar(Cliente cliente, String sql) {
        try {
            PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);
            
            preparedStatementSet(preparedStatement, cliente);
            
            int resultado = preparedStatement.executeUpdate();
            
            return resultado == 1 ? "Cliente salvo com sucesso." : "Nao foi possivel salvar cliente";
        } catch (SQLException e) {
            return String.format("Error: %s", e.getMessage());
        }
    }
    
    private void preparedStatementSet(PreparedStatement preparedStatement, Cliente cliente) throws SQLException {
       
        preparedStatement.setString(1, cliente.getNome());
        preparedStatement.setString(2, cliente.getTelefone());
        preparedStatement.setString(3, cliente.getEndereco());
        
       if(cliente.getId() != 0L) {
           preparedStatement.setLong(4, cliente.getId());
       }
       
    }
    
    public List<Cliente> todosCliente() {
        String sql = "SELECT * FROM cliente";
        List<Cliente> clientes = new ArrayList<>();
        
        try {
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
            
            while(result.next()) {
                clientes.add(getCliente(result));
            }
            
        } catch (SQLException e) {
            System.out.println(String.format("Error: %s", e.getMessage()));
        }
        
        return clientes;
    }
    
    public Cliente buscarClientePeloId(Long id) {
        String sql = String.format("SELECT * FROM cliente WHERE id=%d", id);
        System.out.println(sql);
        try {
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
            
            while(result.next()) {
                return getCliente(result);
            }
            
        } catch (SQLException e) {
            System.out.println(String.format("Error: %s", e.getMessage()));
        }
        System.out.println("XXXXXXX");
        return null;
    }
    
    public Cliente buscarUltimoCliente() {
        String sql = "SELECT * FROM cliente WHERE id= (SELECT max(id) FROM cliente)";
        
        try {
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
            
            while(result.next()) {
                return getCliente(result);
            }
            
        } catch (SQLException e) {
            System.out.println(String.format("Error: %s", e.getMessage()));
        }
        
        return null;
    }
    
    private Cliente getCliente(ResultSet result) throws SQLException {
        Cliente cliente = new Cliente();
        
        cliente.setId(result.getLong("id"));
        cliente.setNome(result.getString("nome"));
        cliente.setTelefone(result.getString("telefone"));
        cliente.setEndereco(result.getString("morada"));

        System.out.println(cliente);
        return cliente;
    }
    
    public String deleteClientePeloId(Long id) {
        String sql = String.format("DELETE FROM cliente WHERE id = %d", id);
        
        try {
            PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);
            
            int resultado = preparedStatement.executeUpdate();
            
            return resultado == 1 ? "Cliente apagado com sucesso" : "Nao foi possivel apagar cliente";
            
        } catch (SQLException e) {
            return String.format("Error: %s", e.getMessage());
        }
    }
}
