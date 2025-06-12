//====================
//  Apresentacao.java  
//====================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

// Dependencias
import java.time.LocalDateTime;

public class Apresentacao {
    
    // Atributos
    private int idApresentacao;
    private Projeto projeto;
    private Banca banca;
    private Sala local;
    private LocalDateTime dataHora;
    
    // Construtor
    public Apresentacao(int idApresentacao, Projeto projeto, Banca banca, Sala local, LocalDateTime dataHora) {
        this.idApresentacao = idApresentacao;
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }

    // Getters e Setters
    public int getIdApresentacao() {
        return idApresentacao;
    }

    public void setIdApresentacao(int idApresentacao) {
        this.idApresentacao = idApresentacao;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Banca getBanca() {
        return banca;
    }

    public void setBanca(Banca banca) {
        this.banca = banca;
    }

    public Sala getLocal() {
        return local;
    }

    public void setLocal(Sala local) {
        this.local = local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    // Avaliar a apresentação
    public void avaliar() {
        if (this.banca != null) {
            this.banca.calcularNotaFinal(); // A banca calcula a nota e atribui ao projeto
            System.out.println("Apresentação do projeto '" + projeto.getTitulo() + "' . Nota final: " + projeto.getNotaFinal());
        } else {
            System.out.println("Não há banca para avaliar esta apresentação.");
        }
    }
    
    // Converter para String
    @Override
    public String toString() {
        return "Apresentação ID: " + idApresentacao +
               "\n  Projeto: " + (projeto != null ? projeto.getTitulo() : "N/A") +
               "\n  Banca ID: " + (banca != null ? banca.getIdBanca() : "N/A") +
               "\n  Local: " + (local != null ? local.getNome() : "N/A") +
               "\n  Data/Hora: " + dataHora;
    }
}
