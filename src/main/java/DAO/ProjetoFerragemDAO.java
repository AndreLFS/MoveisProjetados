/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classe.Projeto;
import Classe.projeto_ferragen;
import java.util.List;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Andre
 */
public class ProjetoFerragemDAO extends GenericoDAO<projeto_ferragen>{

    public ProjetoFerragemDAO() {
        super(projeto_ferragen.class);
    }
    
    @Override
    public boolean salvar(projeto_ferragen projeto) {
        if(projeto.getId()== 0){
            return super.salvar(projeto);
        }else{
            return super.editar(projeto);
        }
    }
}
