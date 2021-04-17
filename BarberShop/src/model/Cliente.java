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
public class Cliente extends Pessoa{
    private String endereco;
    private String cep;

    public Cliente(int id, String Nome,  char sexo, String dataDeNascimento, String telefone, String email, String cep, String endereco,   String rg) {
        super(id, Nome, sexo, dataDeNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }
    
   

    public Cliente( int id, String Nome, String endereco, String cep) {
        super(id, Nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    
}
