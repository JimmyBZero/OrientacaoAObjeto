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
        
        Pessoa joao = new Pessoa("Joao", "Silva", 20, 0001);
        Pessoa maria = new Pessoa("Maria", "Nunes", 22, 0002);
        Pessoa felipe = new Pessoa("Felipe", "Yoshi", 16, 0003);
        
        Dao dao = new PessoaDaoDerby();
        //dao.listarTudo();
        //dao.adicionar(joao);


        
//        dao.remover(joao);
//        dao.remover(felipe);
//        dao.remover(maria);
//        dao.listarTudo();

        
        
        
    
    
    
    
    }
    
}
