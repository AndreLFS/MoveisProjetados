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
    
    private int valor;

    public projeto_ferragen() {
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
