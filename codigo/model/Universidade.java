//==================================
//  Universidade.java  <<extends>>
//==================================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public class Universidade extends Instituicao {
    
    // Atributos
    private String estado;
    private String cidade;
    
    // Construtor
    public Universidade(int idInstituicao, String nomeInstituicao, String estado, String cidade) {
        super(idInstituicao, nomeInstituicao);
        this.estado = estado;
        this.cidade = cidade;
    }

    // Getters e Setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    // Converter para String
    @Override
    public String toString() {
        return "Universidade - " + super.toString() + ", Estado: " + estado + ", Cidade: " + cidade;
    }
}