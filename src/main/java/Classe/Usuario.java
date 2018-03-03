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
    private String login;
    private String senha;
    //se o usuario esta ativo ou não
    private boolean ativo;

    public Usuario() {
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public String getLoguin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
    
    
     
}
