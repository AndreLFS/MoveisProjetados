/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classe.CategoriaFerragens;
import Classe.Ferragens;
import java.util.List;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author DTI
 */
public class FerragensDAO extends GenericoDAO<Ferragens>{

    public FerragensDAO() {
        super(Ferragens.class);
    }
    
     @Override
    public boolean salvar(Ferragens ferragens) {
        //verifica se a ferragen ja tem um id salvo
        if(ferragens.getId()== 0){
            //caso não exista sera salvo um nova ferragen
            return super.salvar(ferragens);
        }else{
            //caso exista sera atualizado a ferragen
            return super.editar(ferragens);
        }
    }
    
    @Override
    public List<Ferragens> listar() {
        List<Ferragens> lista=null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(Ferragens.class).
                    //restrição que so permite que aparecam ferragen ativos
                    add(Restrictions.eq("ativo", true)).
                    //ordem na lista por ordem alfabetica
                    addOrder(Order.desc("categoriaFerragens")).
                    addOrder(Order.asc("descricao")).list();
        } catch (Exception e) {
            System.out.println("Erro na lista: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }
}
