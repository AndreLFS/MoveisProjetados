/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Classe.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LAB1
 */
public class ClienteTabelModel extends AbstractTableModel{
    private String[] colunas = {"NOME", "TELEFONE", "CPF"}; 
    private List<Cliente> clientes;

    public ClienteTabelModel(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        switch (columnIndex){
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getTelefone();
            case 2:
                return cliente.getCpf();
        }
        return null;
    }
    
    public Cliente getValueAt(int rowIndex){
        return clientes.get(rowIndex);
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
