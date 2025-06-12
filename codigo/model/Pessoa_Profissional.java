//=========================================
//  Pessoa_Profissional.java  <<extends>>
//=========================================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public class Pessoa_Profissional extends Pessoa {
    
    // Atributos
    private String profissao;
    
    // Construtor
    public Pessoa_Profissional(int idPessoa, String nomePessoa, String cpfPessoa, String telefonePessoa, Instituicao instituicao, String profissao) {
        super(idPessoa, nomePessoa, cpfPessoa, telefonePessoa, instituicao);
        this.profissao = profissao;
    }

    // Getter e Setter
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Converter para String
    @Override
    public String toString() {
        return "Profissional - " + super.toString() + ", Profissão: " + profissao;
    }
}