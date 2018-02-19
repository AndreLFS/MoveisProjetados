/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
    @OneToOne
    private CategoriaFerragens categoriaFerragens;
    
    @OneToMany(mappedBy = "ferragens")
    private Set<projeto_ferragen> projeto_ferragens = new HashSet<projeto_ferragen>();
    
    public Ferragens() {
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public CategoriaFerragens getCategoriaFerragens() {
        return categoriaFerragens;
    }

    public void setCategoriaFerragens(CategoriaFerragens categoriaFerragens) {
        this.categoriaFerragens = categoriaFerragens;
    }
    
    
}
