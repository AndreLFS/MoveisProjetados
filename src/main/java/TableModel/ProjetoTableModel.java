/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Classe.Projeto;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LAB1
 */
public class ProjetoTableModel extends AbstractTableModel{
    private String[] colunas = {"CLIENTE", "COMODO", "DATA FINAL", "VALOR PROJETO"}; 
    private List<Projeto> projetos;

    public ProjetoTableModel(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    @Override
    public int getRowCount() {
        return projetos.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    public Object getValueAt(int rowIndex, int columnIndex) {
        Projeto projeto = projetos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return projeto.getCliente().getNome();
            case 1:
                return projeto.getComodo();
            case 2:
                return formato.format(projeto.getDataFinal());
            case 3:
                return projeto.getValorProjeto();
        }
        return null;
    }
    
    public Projeto getValueAt(int rowIndex){
        return projetos.get(rowIndex);
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
}
