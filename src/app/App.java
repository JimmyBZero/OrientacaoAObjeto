/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dao.Dao;
import dao.PessoaDaoArrayList;
import dao.PessoaDaoVetor;
import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class App {
    
    public static void main(String[] args) {
        
        Pessoa joao = new Pessoa("Joao", "Silva", 20);
        Pessoa maria = new Pessoa("Maria", "Nunes", 22);
        Pessoa felipe = new Pessoa("Felipe", "Yoshi", 16);
        Dao dao = new PessoaDaoVetor(3);
        
        
        dao.adicionar(joao);
        dao.adicionar(felipe);
        dao.adicionar(maria);
        dao.listarTudo();
        
        System.out.println("Remover !");
        dao.remover(felipe);
        dao.listarTudo();
        
        
        
    
    
    
    
    }
    
}
