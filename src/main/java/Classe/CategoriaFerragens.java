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
 * @author Andre
 * 
 */@Entity
public class CategoriaFerragens {
    
    @Id
    @GeneratedValue 
    private int id;
    private String descricao;
    //data e hora que a categoria foi salvo no sistema
    private Date dataCadastro;
    //data e hora que a categoria foi excluido no sistema
    private Date dataDesativacao;
    //se ele ainda ira aparecer nas listas ou não
    private boolean ativo;

    public CategoriaFerragens() {
    }

    public int getId() {
        return id;
    } 

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataDesativacao() {
        return dataDesativacao;
    }

    public void setDataDesativacao(Date dataDesativacao) {
        this.dataDesativacao = dataDesativacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    
    
    
    
}
