/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classe.CategoriaFerragens;
import java.util.Date;
import java.util.List;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Andre
 */
public class CategoriaFerragenDAO extends GenericoDAO<CategoriaFerragens>{

    public CategoriaFerragenDAO() {
        super(CategoriaFerragens.class);
    }
    
    @Override
    public boolean salvar(CategoriaFerragens categoriaFerragen) {
        //verifica se a categoria ja tem um id salvo
        if(categoriaFerragen.getId()== 0){
            //caso não exista sera salvo um nova categoria
            return super.salvar(categoriaFerragen);
        }else{
            //caso exista sera atualizado a categoria
            return super.editar(categoriaFerragen);
        }
    }
    
    @Override
    public List<CategoriaFerragens> listar() {
        List<CategoriaFerragens> lista=null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(CategoriaFerragens.class).
                    //restrição que so permite que aparecam CategoriaFerragens ativos
                    add(Restrictions.eq("ativo", true)).
                    //ordem na lista por ordem alfabetica
                    addOrder(Order.asc("descricao")).list();
        } catch (Exception e) {
            System.out.println("Erro na lista: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }
    
    @Override
    public boolean deletar(CategoriaFerragens categoriaFerragens) {
        categoriaFerragens.setAtivo(false);
        categoriaFerragens.setDataDesativacao(new Date());
        return super.editar(categoriaFerragens);
    }
}
