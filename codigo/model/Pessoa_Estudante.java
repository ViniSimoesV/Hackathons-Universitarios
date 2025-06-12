//=========================================
//  Pessoa_Estudante.java  <<extends>>
//=========================================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public class Pessoa_Estudante extends Pessoa {

    // Atributos
    private String curso;
    
    // Construtor
    public Pessoa_Estudante(int idPessoa, String nomePessoa, String cpfPessoa, String telefonePessoa, Instituicao instituicao, String curso) {
        super(idPessoa, nomePessoa, cpfPessoa, telefonePessoa, instituicao);
        this.curso = curso;
    }

    // Getter e Setter
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // Converter para String
    @Override
    public String toString() {
        return "Estudante - " + super.toString() + ", Curso: " + curso;
    }
}