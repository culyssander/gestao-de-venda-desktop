/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.conexao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author quitumba
 */
public interface Conexao {
    
    public Connection obterConexao() throws SQLException;
    public void fecharConexao()throws SQLException;
    
}
