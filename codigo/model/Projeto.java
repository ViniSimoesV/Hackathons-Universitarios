//================
//  Projeto.java
//================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public class Projeto {
    
    // Atributos
    private int idProjeto; 
    private String titulo; 
    private Pessoa_Profissional orientador; 
    private Equipe equipe; 
    private int notaFinal;
    
    // Construtor
    public Projeto(int idProjeto, String titulo, Pessoa_Profissional orientador, Equipe equipe) {
        this.idProjeto = idProjeto;
        this.titulo = titulo;
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = 0;
    }

    // Getters e Setters
    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa_Profissional getOrientador() {
        return orientador;
    }

    public void setOrientador(Pessoa_Profissional orientador) {
        this.orientador = orientador;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    // Converter para String
    @Override
    public String toString() {
        return "Projeto ID: " + idProjeto + ", Título: " + titulo +
               "\n  Orientador: " + (orientador != null ? orientador.getNomePessoa() : "N/A") +
               "\n  Equipe: " + (equipe != null ? equipe.getNome() : "N/A") +
               "\n  Nota Final: " + notaFinal;
    }
}
