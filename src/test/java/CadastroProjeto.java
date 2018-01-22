
import Classe.Ferragens;
import Classe.Projeto;
import DAO.FerragensDAO;
import DAO.ProjetoDAO;
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
        FerragensDAO ferragensDAO = new FerragensDAO();
        Ferragens ferragens = ferragensDAO.listar().get(0);
        
        List<Ferragens> materiais = new ArrayList<Ferragens>();
        materiais.add(ferragens);
        materiais.add(ferragens);
        
        Projeto projeto = new Projeto();
        projeto.setMateriais(materiais);
        
        ProjetoDAO projetoDAO = new ProjetoDAO();
        projetoDAO.salvar(projeto);
    }
}
