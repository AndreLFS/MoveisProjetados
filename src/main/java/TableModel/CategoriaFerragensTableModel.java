/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Classe.CategoriaFerragens;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LAB1
 */
public class CategoriaFerragensTableModel extends AbstractTableModel{
    private String[] colunas = {"Descrição"}; 
    private List<CategoriaFerragens> categoriaFerragens;

    public CategoriaFerragensTableModel(List<CategoriaFerragens> categoriaFerragens) {
        this.categoriaFerragens = categoriaFerragens;
    }

    @Override
    public int getRowCount() {
        return categoriaFerragens.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        CategoriaFerragens categoriaFerragen = categoriaFerragens.get(rowIndex);
        switch (columnIndex){
            case 0:
                return categoriaFerragen.getDescricao();
        }
        return null;
    }
    
    public CategoriaFerragens getValueAt(int rowIndex){
        return categoriaFerragens.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
         switch (column){
            case 0:
                return colunas[0];
        }
         return null;
    }
}
