/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classe.Cliente;
import java.util.Date;
import java.util.List;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author LAB1
 */
public class ClienteDAO  extends GenericoDAO<Cliente>{

    public ClienteDAO() {
        super(Cliente.class);
    }
    @Override
    public boolean salvar(Cliente cliente) {
        //verifica se o cliente ja tem um id salvo
        if(cliente.getId()== 0){
            //caso não exista sera salvo um novo cliente
            return super.salvar(cliente);
        }else{
            //caso exista sera atualizado o cliente
            return super.editar(cliente);
        }
    }
    
    @Override
    public List<Cliente> listar() {
        List<Cliente> lista=null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(Cliente.class).
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
    
    @Override
    public boolean deletar(Cliente cliente) {
        cliente.setAtivo(false);
        cliente.setDataDesativacao(new Date());
        return super.editar(cliente);
    }
    
}
