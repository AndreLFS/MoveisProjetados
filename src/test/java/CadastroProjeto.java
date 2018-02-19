
import Classe.Ferragens;
import Classe.Projeto;
import Classe.projeto_ferragen;
import DAO.FerragensDAO;
import DAO.ProjetoDAO;
import DAO.ProjetoFerragemDAO;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DTI
 */
public class CadastroProjeto {
    public static void main(String[] args) {
        Ferragens ferragens = new Ferragens();
        ferragens.setAtivo(true);
        ferragens.setDescricao("sdfjkngu2kjsd");
        
        Projeto projeto = new Projeto();
        projeto.setAtivo(true);
        projeto.setComodo("quart2o");
        
        projeto_ferragen n = new projeto_ferragen();
        n.setFerragens(ferragens);
        n.setProjeto(projeto);
        n.setValor(2121);
        
        ProjetoFerragemDAO projetoFerragemDAO = new ProjetoFerragemDAO();
        projetoFerragemDAO.salvar(n);
        
    }
}
