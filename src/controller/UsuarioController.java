/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
import model.UsuarioDAO;

/**
 *
 * @author KauaValim
 */
public class UsuarioController {
    private UsuarioDAO usuarioDAO;
    
    public UsuarioController() {
        usuarioDAO = new UsuarioDAO();
    }
    
    public boolean autenticar(String email, String senha) {
        if (usuarioDAO.autenticar(email, senha)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta");
            return false;
        }
    }
    
    public boolean adicionarUsuario(Usuario u) {
        if (usuarioDAO.adicionarUsuario(u)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Usuario não cadastrado");
            return false;
        }
    }
    
    public boolean alterarUsuario(Usuario u, Long pk) {
        if (usuarioDAO.alterarUsuario(u, pk)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Usuario não cadastrado");
            return false;
        }
    }
    
    public boolean excluirUsuario(Usuario u, Long pk) {
        if (usuarioDAO.excluirUsuario(u, pk)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Usuario não cadastrado");
            return false;
        }
    }
    
    // TODO método readForDesc()

    public List<Usuario> readForDesc(int tipo, String desc) {
       return usuarioDAO.readForDesc(tipo, desc);
    }
    
    public Usuario readForPk(long pk) {
        Usuario usu = usuarioDAO.readForPk(pk);
        if(usu == null) {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            return null;
        }
        return usu;
    }
    
}
