/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author DTI
 */
@Entity
@Table(name = "PROJETO_FERRAGEN")
public class projeto_ferragen {
    @Id
    @GeneratedValue 
    private long id;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "projeto_id")	
    private Projeto projeto;
    @ManyToOne(targetEntity = Ferragens.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ferragens_id")	
    private Ferragens ferragens;
    
    private double valorTotal;
    private double valorUnidade;
    private int quantidade;

    public projeto_ferragen() {
    }

    public long getId() {
        return id;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Ferragens getFerragens() {
        return ferragens;
    }

    public void setFerragens(Ferragens ferragens) {
        this.ferragens = ferragens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
    
}
