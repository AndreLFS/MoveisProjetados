/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classe.Usuario;
import java.util.List;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author DTI
 */
public class UsuarioDAO extends GenericoDAO<Usuario>{

    public UsuarioDAO() {
        super(Usuario.class);
    }
    
    @Override
    public List<Usuario> listar() {
        List<Usuario> lista=null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(Usuario.class).
                    //restrição que so permite que aparecam clientes ativos
                    add(Restrictions.eq("ativo", true)).list();
        } catch (Exception e) {
            System.out.println("Erro na lista: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }
}
