/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.dao;

import com.culysoft.gestaovenda.modelo.conexao.Conexao;
import com.culysoft.gestaovenda.modelo.conexao.ConexaoMysql;
import com.culysoft.gestaovenda.modelo.entidades.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quitumba
 */
public class CategoriaDao {

    private final Conexao conexao;

    public CategoriaDao() {
        this.conexao = new ConexaoMysql();
    }

    public String salvar(Categoria categoria) {
        return categoria.getId() == 0L ? adicionar(categoria) : editar(categoria);
    }

    private String adicionar(Categoria categoria) {
        String sql = "INSERT INTO categoria(nome, descricao) VALUES(?, ?)";
        
        Categoria categoriaTemp = buscarCategoriaPeloNome(categoria.getNome());
        
        if(categoriaTemp != null) {
            return String.format("Error: %s ja existe no banco de dados", categoria.getNome());
        }
        
        try {
            PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);

            preparedStatementSet(preparedStatement, categoria);

            int resultado = preparedStatement.executeUpdate();
            return resultado == 1 ? "Categoria adicionado com sucesso." : "Nao possivel adicionar a categoria";
        } catch (SQLException e) {
            return String.format("Error: %s", e.getMessage());
        }
    }

    private String editar(Categoria categoria) {
        String sql = "UPDATE categoria SET nome = ?, descricao = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);

            preparedStatementSet(preparedStatement, categoria);

            int resultado = preparedStatement.executeUpdate();
            return resultado == 1 ? "Categoria editado com sucesso." : "Nao possivel editar a categoria";
        } catch (SQLException e) {
            return String.format("Error: %s", e.getMessage());
        }
    }

    private void preparedStatementSet(PreparedStatement preparedStatement, Categoria categoria) throws SQLException {
        preparedStatement.setString(1, categoria.getNome());
        preparedStatement.setString(2, categoria.getDescricao());

        if (categoria.getId() != 0L) {
            preparedStatement.setLong(3, categoria.getId());
        }
    }

    public List<Categoria> todasCategorias() {
        String sql = "SELECT * FROM categoria";
        List<Categoria> categorias = new ArrayList<>();

        try {
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();

            while (result.next()) {
                categorias.add(getCategoria(result));
            }
        } catch (SQLException e) {
            System.out.println(String.format("Error: %s", e.getMessage()));
        }

        return categorias;
    }

    public Categoria buscarCategoriaPeloId(Long id) {
        String sql = String.format("SELECT * FROM categoria WHERE id = %d", id);
        try {
            
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();

            if (result.next()) {
                return getCategoria(result);
            }
        } catch (SQLException e) {
            System.out.println(String.format("Error: %s", e.getMessage()));
        }

        return null;
    }
    
    public Categoria buscarCategoriaPeloNome(String nome) {
        String sql = String.format("SELECT * FROM categoria WHERE nome = '%s'", nome);
        try {
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();

            if (result.next()) {
                return getCategoria(result);
            }
        } catch (SQLException e) {
            System.out.println(String.format("Error: %s", e.getMessage()));
        }

        return null;
    }
    
    public String deleteCategoriaPeloId(Long id) {
        String sql = String.format("DELETE FROM categoria WHERE id = %d", id);
        try {
            PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);

            int resultado = preparedStatement.executeUpdate();
            
            return resultado == 1 ? "Categoria apagado com sucesso." : "Nao foi possivel apagar categoria";
            
        } catch (SQLException e) {
            System.out.println(String.format("Error: %s", e.getMessage()));
            if(e.getMessage().startsWith("Cannot delete or update a parent row")) {
                return "Nao foi possivel apagar - Categoria associado ao produto";
            }
            return String.format("Error: %s", e.getMessage());
        }
    }

    private Categoria getCategoria(ResultSet result) throws SQLException {
        Categoria categoria = new Categoria();

        categoria.setId(result.getLong("id"));
        categoria.setNome(result.getString("nome"));
        categoria.setDescricao(result.getString("descricao"));

        return categoria;
    }

}
