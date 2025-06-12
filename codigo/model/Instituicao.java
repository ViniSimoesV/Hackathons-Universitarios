//==================================
//  Instituicao.java  <<Abstract>>
//==================================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public abstract class Instituicao { 
    
    // Atributos
    protected int idInstituicao;
    protected String nomeInstituicao;
    
    // Construtor
    public Instituicao(int idInstituicao, String nomeInstituicao) {
        this.idInstituicao = idInstituicao;
        this.nomeInstituicao = nomeInstituicao;
    }

    // Getters e Setters
    public int getIdInstituicao() {
        return idInstituicao;
    }

    public void setIdInstituicao(int idInstituicao) {
        this.idInstituicao = idInstituicao;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }
    
    // Converter para String
    @Override
    public String toString() {
        return "ID: " + idInstituicao + ", Nome: " + nomeInstituicao;
    }  
}
