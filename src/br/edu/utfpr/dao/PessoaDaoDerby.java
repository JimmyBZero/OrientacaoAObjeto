/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoDerby implements Dao{

    Statement stmt;
    
    //quando eu construir um objeto dessa classe, vou conectar no banco.
    public PessoaDaoDerby(){
        String username = "theBoss";
        String password = "123";
        String url = "jdbc:derby://localhost:1527/MeuBancoDeDados";
        
        //depois disso, posso mandar conectar
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
    }
    }
    
    
    
    @Override
    public void adicionar(Pessoa p) {
    }

    @Override
    public void remover(Pessoa p) {
      
    }

    @Override
    public void listarTudo() {
       
    }
    
    
    
}
