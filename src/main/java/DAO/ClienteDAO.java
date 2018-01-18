/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classe.Cliente;
import java.util.List;
import org.hibernate.criterion.Order;

/**
 *
 * @author LAB1
 */
public class ClienteDAO  extends GenericoDAO<Cliente>{

    public ClienteDAO() {
        super(Cliente.class);
    }
}
