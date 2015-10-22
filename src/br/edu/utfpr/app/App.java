/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.app;

import br.edu.utfpr.dao.Dao;
import br.edu.utfpr.dao.PessoaDaoArrayList;
import br.edu.utfpr.dao.PessoaDaoDerby;
import br.edu.utfpr.dao.PessoaDaoVetor;
import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class App {
    
    public static void main(String[] args) {
        
        Pessoa joao = new Pessoa("Joao", "Silva", 20);
        Pessoa maria = new Pessoa("Maria", "Nunes", 22);
        Pessoa felipe = new Pessoa("Felipe", "Yoshi", 16);
        
        Dao dao = new PessoaDaoDerby();
        
        
//        dao.adicionar(joao);
//        dao.adicionar(felipe);
//        dao.adicionar(maria);
//        dao.listarTudo();
//        
//        System.out.println("Remover !");
//        dao.remover(felipe);
//        dao.listarTudo();
        
        
        
    
    
    
    
    }
    
}
