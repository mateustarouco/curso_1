/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author mateu
 */
public class Usuario extends Pessoa{
    protected String senha;
    protected String nivelDeAcesso;

 
            
            
            
    public Usuario(String senha, int id, String Nome) {
        super(id, Nome);
        this.senha = senha;
    }

    public Usuario( int id, String Nome, char sexo, String  dataDeNascimento,String telefone, String email, String rg, String senha, String nivelDeAcesso) {
        super(id, Nome, sexo, dataDeNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }
   
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    
    
    
}
