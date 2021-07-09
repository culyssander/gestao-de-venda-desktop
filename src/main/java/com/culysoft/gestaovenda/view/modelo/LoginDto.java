/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.view.modelo;

/**
 *
 * @author quitumba
 */
public class LoginDto {
    
    private String username;
    private String senha;

    public LoginDto() {
    }

    public LoginDto(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }
   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
