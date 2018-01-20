/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author ANDRE
 */

//classe com os usuarios do sistema
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue 
    private int id;
    private String loguin;
    private String senha;
    //se o usuario esta ativo ou não
    private boolean ativo;

    public Usuario() {
    }

    public Usuario(String loguin, String senha) {
        this.loguin = loguin;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public String getLoguin() {
        return loguin;
    }

    public String getSenha() {
        return senha;
    }
    
    
    
     
}
