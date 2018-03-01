/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Classe.CategoriaFerragens;
import Classe.Projeto;
import Classe.projeto_ferragen;
import DAO.ProjetoDAO;
import DAO.ProjetoFerragemDAO;
import Visao.Home;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LAB1
 */
public class ProjetoFerragemTableModel extends AbstractTableModel{
    private String[] colunas = {"Descrição", "Quantidade", "Valor Unidade", "Valor Total"}; 
    private List<projeto_ferragen> projetoFerragem;

    public ProjetoFerragemTableModel(List<projeto_ferragen> projetoFerragem) {
        this.projetoFerragem = projetoFerragem;
    }

    @Override
    public int getRowCount() {
        return projetoFerragem.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        projeto_ferragen projetoFerragen = projetoFerragem.get(rowIndex);
        switch (columnIndex){
            case 0:
                return projetoFerragen.getFerragens().getDescricao();
            case 1:
                return projetoFerragen.getQuantidade();
            case 2:
                return projetoFerragen.getValorUnidade();
            case 3:
                return projetoFerragen.getValorTotal();
        }
        return null;
    }
    
    public projeto_ferragen getValueAt(int rowIndex){
        return projetoFerragem.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
         switch (column){
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
        }
         return null;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
            case 3:
                return false;
        }
        return true;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        projeto_ferragen linha = projetoFerragem.get(rowIndex);
        switch(columnIndex){
            case 1: 
                int valor = Integer.parseInt(aValue.toString());
                if(valor <= 0){
                    JOptionPane.showMessageDialog(null, "Valor não pode ser menor que zero");
                    return;
                }
                linha.setQuantidade(valor);  
                break;
            case 2:
                double preco = Double.valueOf(aValue.toString());
                if(preco <= 0){
                    JOptionPane.showMessageDialog(null, "Valor não pode ser menor que zero");
                    return;
                }
                linha.setValorUnidade(preco);
        }
        ProjetoFerragemDAO projetoFerragemDAO = new ProjetoFerragemDAO();
        linha.setValorTotal();
        projetoFerragemDAO.salvar(linha);
        Home.atualizarTabelaProjetoFerragem(linha.getProjeto());
    }
    
}
