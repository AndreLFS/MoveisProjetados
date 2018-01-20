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
  //  @OneToOne
  //  private Cliente cliente;
    private String sala;
    private String numeroMoveis;
    private String formaPagamento;
    private Date dataInico;
    private Date dataFinal;
    //data e hora que o projeto foi salvo no sistema
    private Date dataCadastro;
    //se ele ainda ira aparecer nas listas ou não
    private boolean ativo;
    //@ManyToMany
   /*  @JoinTable(name="pessoa_has_notebooks", joinColumns=
      {@JoinColumn(name="pessoa_id")}, inverseJoinColumns=
        {@JoinColumn(name="notebook_id")})*/
  //  private List<Ferragens> materiais;
}
