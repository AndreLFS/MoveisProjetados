/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Classe.Ferragens;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LAB1
 */
public class FerragensTableModel extends AbstractTableModel{
    private String[] colunas = {"CATEGORIA", "DESCRIÇÃO", "VALOR"}; 
    private List<Ferragens> ferragens;

    public FerragensTableModel(List<Ferragens> ferragens) {
        this.ferragens = ferragens;
    }

    @Override
    public int getRowCount() {
        return ferragens.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ferragens ferragen = ferragens.get(rowIndex);
        switch (columnIndex){
            case 0:
                return ferragen.getCategoriaFerragens().getDescricao();
            case 1:
                return ferragen.getDescricao();
            case 2:
                return ferragen.getValor();
        }
        return null;
    }
    
    public Ferragens getValueAt(int rowIndex){
        return ferragens.get(rowIndex);
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
