/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.controller;

import com.culysoft.gestaovenda.modelo.dao.AutenticacaoDao;
import com.culysoft.gestaovenda.modelo.dao.UsuarioDao;
import com.culysoft.gestaovenda.modelo.util.UsuarioTableModel;
import com.culysoft.gestaovenda.modelo.entidades.PERFIL;
import com.culysoft.gestaovenda.modelo.entidades.Usuario;
import com.culysoft.gestaovenda.modelo.exception.NegocioException;
import com.culysoft.gestaovenda.view.formulario.Dashboard;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author quitumba
 */
public class UsuarioController implements ActionListener, MouseListener, KeyListener{
    
    private Dashboard dashboard;
    private AutenticacaoDao autenticacaoDao;
    private UsuarioTableModel usuarioTableModel;
    private UsuarioDao usuarioDao;
    private Usuario usuario;

    public UsuarioController(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.autenticacaoDao = new AutenticacaoDao();
        this.usuarioDao = new UsuarioDao();
        inicializaComboBoxUsuarioPerfil();
        actualizarTabelaUsuario(usuarioDao.todosUsuarios());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String accao = ae.getActionCommand().toLowerCase();
        
        switch(accao) {
            case "adicionar": adicionar(); break;
            case "editar": editar(); break;
            case "apagar": remover(); break;
            case "salvar": salvar(); break;
            case "cancelar": ocultaTelaUsuario(); break;
        }
    }
    
    private void inicializaComboBoxUsuarioPerfil() {
        this.dashboard.getComboBoxUsuarioPerfil().removeAllItems();
        this.dashboard.getComboBoxUsuarioPerfil().addItem("Seleciona o perfil");
        
        for(PERFIL perfil : PERFIL.values()) {
            this.dashboard.getComboBoxUsuarioPerfil().addItem(perfil);
        }
    }
    
    private void mostrarTelaUsuario() {
        this.dashboard.getDialogUsuario().pack();
        this.dashboard.getDialogUsuario().setLocationRelativeTo(dashboard);
        this.dashboard.getDialogUsuario().setVisible(true);
    }
    
    private void ocultaTelaUsuario() {
        this.dashboard.getDialogUsuario().pack();
        this.dashboard.getDialogUsuario().setLocationRelativeTo(dashboard);
        this.dashboard.getDialogUsuario().setVisible(false);
        limpaCampos();
        mensagemNaTela("", Color.WHITE);
    }
    
    private Usuario usuarioLogado() {
        Long usuarioLogadoId = Long.valueOf(this.dashboard.getLabelUsuarioLogadoId().getText());
        return usuarioDao.buscarUsuarioPeloId(usuarioLogadoId);
    }

    private void adicionar() {
        Usuario usuarioLogado = usuarioLogado();
        if(autenticacaoDao.temPermissao(usuarioLogado)) 
            mostrarTelaUsuario();
    }

    private void editar() {
        Usuario usuarioLogado = usuarioLogado();
        if(autenticacaoDao.temPermissao(usuarioLogado)) {
            if(this.usuario != null) {
                preencherOsValoresNoFormularioUsuario();
                mostrarTelaUsuario();
            } else {
                JOptionPane.showMessageDialog(dashboard, "Deves selecionar um usuario na tabela", "Seleciona um usuario", 0);
            }
        }
            
    }

    private void remover() {
        Usuario usuarioLogado = usuarioLogado();
        if(autenticacaoDao.temPermissao(usuarioLogado)) {
            if(this.usuario != null) {
                if(this.usuario.equals(usuarioLogado)) {
                    JOptionPane.showMessageDialog(dashboard, "Usuario logado nao pode ser removido", "Usuario logado", 0);
                } else {
                    int confirmar = JOptionPane.showConfirmDialog(dashboard, 
                        String.format("Tens certeza que desejas apagar? \nNome: %s", this.usuario.getNome()), 
                        "Apagar usuario", JOptionPane.YES_NO_OPTION);
                
                    if(confirmar == JOptionPane.YES_OPTION) {
                        String mensagem = usuarioDao.deleteUsuarioPeloId(this.usuario.getId());
                        JOptionPane.showMessageDialog(dashboard, mensagem);
                        limpaCampos();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(dashboard, "Deves selecionar um usuario na tabela", "Seleciona um usuario", 0);
            }
        }
    }
    
    private void limpaCampos(){
        this.dashboard.getTxtUsuarioId().setText("0");
        this.dashboard.getTxtUsuarioNome().setText("");
        this.dashboard.getTxtUsuarioUsername().setText("");
        this.dashboard.getTxtUsuarioSenha().setText("");
        this.dashboard.getComboBoxUsuarioPerfil().setSelectedIndex(0);
        this.dashboard.getRadioBotaoActivo().setSelected(true);
        actualizarTabelaUsuario(usuarioDao.todosUsuarios());
        this.usuario = null;
    }
    
    private void validacaoDosCampos(String campo, String nomeDaVariavel) {
        if(campo.isEmpty()) {
            String mensagem = String.format("Deves preencher o campo %s", nomeDaVariavel);
            mensagemNaTela(mensagem, Color.RED);
            throw new NegocioException(mensagem);
        }        
    }
    
    private void validacaoDoPerfil() {
        if(this.dashboard.getComboBoxUsuarioPerfil().getSelectedIndex() == 0) {
            String mensagem = "Deves preencher o perfil";
            mensagemNaTela(mensagem, Color.RED);
            throw new NegocioException(mensagem);
        }
    }
    
    private void preencherOsValoresNoFormularioUsuario() {
        this.dashboard.getTxtUsuarioId().setText(this.usuario.getId().toString());
        this.dashboard.getTxtUsuarioNome().setText(this.usuario.getNome());
        this.dashboard.getTxtUsuarioUsername().setText(this.usuario.getUsername());
        this.dashboard.getTxtUsuarioSenha().setText("");
        this.dashboard.getComboBoxUsuarioPerfil().setSelectedItem(this.usuario.getPerfil());
        
        if(usuario.isEstado()) {
            this.dashboard.getRadioBotaoActivo().setSelected(true);
        }else{
            this.dashboard.getRadioBotaoDesativo().setSelected(true);
        }
    }
    
    private Usuario pegarOsValoresDoFormularioUsuario() {
        String idString = this.dashboard.getTxtUsuarioId().getText();
        String nome = this.dashboard.getTxtUsuarioNome().getText();
        String username = this.dashboard.getTxtUsuarioUsername().getText();
        String senha = this.dashboard.getTxtUsuarioSenha().getText();
        String perfil = this.dashboard.getComboBoxUsuarioPerfil().getSelectedItem().toString();
         
        
        Long id = Long.valueOf(idString);
        
        validacaoDosCampos(nome, "nome");
        validacaoDosCampos(username, "username");
        validacaoDosCampos(senha, "senha");
        validacaoDoPerfil();
        
        Usuario usuarioTemp = new Usuario(id, nome, username, senha, PERFIL.valueOf(perfil), null, null);
        
        if(this.dashboard.getRadioBotaoDesativo().isSelected()) {
            usuarioTemp.mudarEstado();
        }
        
        return usuarioTemp;
    }    

    private void salvar() {
        Usuario usuarioTemp = pegarOsValoresDoFormularioUsuario();
        String mensagem = usuarioDao.salvar(usuarioTemp);
        
        if(mensagem.startsWith("Usuario")) {
            mensagemNaTela(mensagem, Color.GREEN);
            
            limpaCampos();
        } else {
            mensagemNaTela(mensagem, Color.RED);
        }
    }
    
    public void mensagemNaTela(String mensagem, Color color) {
        this.dashboard.getLabelUsuarioMensagem().setText(mensagem);
        this.dashboard.getLabelUsuarioMensagem().setBackground(color);
    }
    
    private void actualizarTabelaUsuario(List<Usuario> usuarios) {
        this.usuarioTableModel = new UsuarioTableModel(usuarios);
        this.dashboard.getTabelaUsuarios().setModel(usuarioTableModel);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int linhaSelecionada = this.dashboard.getTabelaUsuarios().getSelectedRow();
        this.usuario = usuarioTableModel.getUsuarios().get(linhaSelecionada);
    }

    @Override
    public void mousePressed(MouseEvent me) { }

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
        String pesquisar = this.dashboard.getTxtUsuarioPesquisar().getText();
        
        if(pesquisar.isEmpty()) {
            actualizarTabelaUsuario(usuarioDao.todosUsuarios());
        } else {
            List<Usuario> usuariosTemp = this.usuarioDao.todosUsuarios()
                    .stream()
                    .filter((Usuario u) -> {
                        return u.getNome().toLowerCase().contains(pesquisar.toLowerCase()) || 
                                u.getUsername().toLowerCase().contains(pesquisar.toLowerCase()) ||
                                u.getPerfil().name().toLowerCase().contains(pesquisar.toLowerCase());
                    })
                    .collect(Collectors.toList());
            
            actualizarTabelaUsuario(usuariosTemp);
        }
        
    }

}
 