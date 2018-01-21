/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author ANDRE
 */
@Entity
public class Projeto {
    @Id
    @GeneratedValue 
    private int id;
    @OneToOne
    private Cliente cliente;
    private String comodo;
    private String numeroMoveis;
    private String formaPagamento;
    private Date dataInico;
    private Date dataFinal;
    //data e hora que o projeto foi salvo no sistema
    private Date dataCadastro;
    //se ele ainda ira aparecer nas listas ou n�o
    private boolean ativo;
    //@ManyToMany
   /*  @JoinTable(name="pessoa_has_notebooks", joinColumns=
      {@JoinColumn(name="pessoa_id")}, inverseJoinColumns=
        {@JoinColumn(name="notebook_id")})*/
  //  private List<Ferragens> materiais;

    public Projeto() {
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroMoveis() {
        return numeroMoveis;
    }

    public void setNumeroMoveis(String numeroMoveis) {
        this.numeroMoveis = numeroMoveis;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Date getDataInico() {
        return dataInico;
    }

    public void setDataInico(Date dataInico) {
        this.dataInico = dataInico;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getComodo() {
        return comodo;
    }

    public void setComodo(String comodo) {
        this.comodo = comodo;
    }
    
}
