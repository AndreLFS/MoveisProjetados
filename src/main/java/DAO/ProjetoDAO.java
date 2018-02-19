/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classe.Projeto;
import java.util.Date;

/**
 *
 * @author DTI
 */
public class ProjetoDAO extends GenericoDAO<Projeto>{

    public ProjetoDAO() {
        super(Projeto.class);
    }
    @Override
    public boolean deletar(Projeto projeto) {
        projeto.setAtivo(false);
        return super.editar(projeto);
    }
}
