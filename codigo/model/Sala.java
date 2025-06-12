//=============
//  Sala.java  
//=============

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public class Sala {
    
    // Atributos
    private int idSala;
    private String nome;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private int numSala;
    
    // Construtor
    public Sala(int idSala, String nome, String cidade, String bairro, String rua, int numero, int numSala) {
        this.idSala = idSala;
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.numSala = numSala;
    }

    // Getters e Setters
    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }
    
    
    // Converter para String
    @Override
    public String toString() {
        return "Sala ID: " + idSala + ", Nome: " + nome +
               "\n  Endereço: " + rua + ", " + numero + " - " + bairro + ", " + cidade +
               " (Nº Sala: " + numSala + ")";
    }
}
