/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classe.Cliente;
import Classe.Projeto;
import java.util.Date;
import java.util.List;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author DTI
 */
public class ProjetoDAO extends GenericoDAO<Projeto>{

    public ProjetoDAO() {
        super(Projeto.class);
    }
    @Override
    public boolean salvar(Projeto projeto) {
        if(projeto.getId()== 0){
            return super.salvar(projeto);
        }else{
            return super.editar(projeto);
        }
    }
    
    @Override
    public boolean deletar(Projeto projeto) {
        projeto.setAtivo(false);
        projeto.setDataDesativacao(new Date());
        return super.editar(projeto);
    }
    
    @Override
    public List<Projeto> listar() {
        List<Projeto> lista=null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(Projeto.class).
                    //restrição que so permite que aparecam clientes ativos
                    add(Restrictions.eq("ativo", true)).
                    //ordem na lista por data de cadastro.
                    addOrder(Order.desc("dataCadastro")).list();
        } catch (Exception e) {
            System.out.println("Erro na lista: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }
}
