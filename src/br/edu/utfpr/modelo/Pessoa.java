/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.modelo;

/**
 *
 * @author UTFPR
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private int idade;
    private int codigo;
            
    
    public Pessoa(String nome, String sobrenome, int idade, int codigo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
   
    
}
