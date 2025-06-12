//===========================
//  Pessoa.java  <<Abstrac>>
//===========================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

package model;

public abstract class Pessoa {
    
    // Atributos
    protected int idPessoa;
    protected String nomePessoa;
    protected String cpfPessoa;
    protected Instituicao instituicao;
    protected String telefonePessoa;
    
    // Construtor
    public Pessoa(int idPessoa, String nomePessoa, String cpfPessoa, String telefonePessoa, Instituicao instituicao) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.instituicao = instituicao;
    }

    // Getters e Setters
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return "ID: " + idPessoa + ", Nome: " + nomePessoa + ", CPF: " + cpfPessoa + ", Instituição: " + (instituicao != null ? instituicao.getNomeInstituicao() : "N/A");
    }
}
