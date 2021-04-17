/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler.Helpers;

import model.Usuario;
import view.Login;

/**
 *
 * @author mateu
 */
public class LoginHelper {
     
    private final Login view; 

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario ObterModelo(){
        String nome  = view.getTextUser().getText();
        String senha = view.getTextSenha().getText();
        Usuario modelo = new Usuario(senha, 0, nome);
        return modelo;
        
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        view.getTextUser().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTextUser().setText("");
        view.getTextSenha().setText("");
    }
    
}
