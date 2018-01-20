/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author ANDRE
 */

//peças usadas nos projetos
@Entity
public class Ferragens {
    
    @Id
    @GeneratedValue 
    private int id;
    private String descricao;
    private int quantidade;
    private double valor;
    //data e hora que a ferragen foi salvo no sistema
    private Date dataCadastro;
    //data e hora que a ferragen foi desativado no sistema
    private Date dataDesativacao;
    //se ele ainda ira aparecer nas listas ou não
    private boolean ativo;
    
    public Ferragens() {
    }

    public Ferragens(String descricao, int quantidade, double valor) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    
}
