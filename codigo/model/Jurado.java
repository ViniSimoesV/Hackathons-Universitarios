//==================================
//  Universidade.java  <<extends>>
//==================================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public class Jurado extends Pessoa_Profissional {
    
    // Atributos
    private int idJurado;
    
    // Construtor
    public Jurado(int idPessoa, String nomePessoa, String cpfPessoa, String telefonePessoa, Instituicao instituicao, String profissao, int idJurado) {
        super(idPessoa, nomePessoa, cpfPessoa, telefonePessoa, instituicao, profissao);
        this.idJurado = idJurado;
    }

    // Getter e Setter
    public int getIdJurado() {
        return idJurado;
    }

    public void setIdJurado(int idJurado) {
        this.idJurado = idJurado;
    }
    
    // Converter para String
    @Override
    public String toString() {
        return "Jurado - " + super.toString() + " (ID Jurado: " + idJurado + ")";
    }
}