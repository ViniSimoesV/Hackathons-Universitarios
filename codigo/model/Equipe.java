//===============
//  Equipe.java
//===============

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

package model;

// Dependencias
import java.util.ArrayList;
import java.util.List;

public class Equipe {
    
    // Atributos
    private int idEquipe;
    private String nome;
    private List<Pessoa_Estudante> membros;
    
    // Construtor
    public Equipe(int idEquipe, String nome) {
        this.idEquipe = idEquipe;
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    // Getters e Setters
    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pessoa_Estudante> getMembros() {
        return membros;
    }

    public void adicionarMembro(Pessoa_Estudante estudante) {
        if (estudante != null && !this.membros.contains(estudante)) {
            this.membros.add(estudante);
        }
    }
    
    // Converter para String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipe ID: ").append(idEquipe).append(", Nome: ").append(nome).append("\n");
        sb.append("Membros:\n");
        if (membros.isEmpty()) {
            sb.append("  Nenhum membro.\n");
        } else {
            for (Pessoa_Estudante estudante : membros) {
                sb.append("  - ").append(estudante.getNomePessoa()).append(" (ID: ").append(estudante.getIdPessoa()).append(")\n");
            }
        }
        return sb.toString();
    }
}
