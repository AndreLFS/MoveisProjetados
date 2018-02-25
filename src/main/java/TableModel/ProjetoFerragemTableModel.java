/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Classe.CategoriaFerragens;
import Classe.projeto_ferragen;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LAB1
 */
public class ProjetoFerragemTableModel extends AbstractTableModel{
    private String[] colunas = {"Descrição", "Quantidade", "Valor"}; 
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
        }
         return null;
    }
}
