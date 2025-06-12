//=============================
//  Banca.java <<implements>>
//=============================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

// Dependencias
import java.util.HashMap;
import java.util.Map;


public class Banca implements Avaliavel {
    
    // Atributos
    private int idBanca;
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> juradosNotas;
    
    // Construtor
    public Banca(int idBanca, Projeto projetoAvaliado) {
        this.idBanca = idBanca;
        this.projetoAvaliado = projetoAvaliado;
        this.juradosNotas = new HashMap<>();
    }

    // Getters e Setters
    public int getIdBanca() {
        return idBanca;
    }

    public void setIdBanca(int idBanca) {
        this.idBanca = idBanca;
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public void setProjetoAvaliado(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }

    public Map<Jurado, Integer> getJuradosNotas() {
        return juradosNotas;
    }

    public void adicionarJurado(Jurado jurado, int nota) {
        if (jurado != null) {
            this.juradosNotas.put(jurado, nota);
        }
    }

    // Calcular a nota final do projeto
    public void calcularNotaFinal() {
        
        // caso não tenha jurados, nota 0
        if (juradosNotas.isEmpty()) {
            if (projetoAvaliado != null) {
                projetoAvaliado.setNotaFinal(0);
            }
            return;
        }
        
        // somar nota dos jurados, armazena em Projetos Avaliados
        double somaNotas = 0;
        for (Integer nota : juradosNotas.values()) {
            somaNotas += nota;
        }
        int notaFinalArredondada = (int) Math.round(somaNotas / juradosNotas.size());
        
        if (projetoAvaliado != null) {
            projetoAvaliado.setNotaFinal(notaFinalArredondada);
        }
    }
    
    
    // Converter para String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banca ID: ").append(idBanca).append("\n");
        sb.append("  Projeto Avaliado: ").append(projetoAvaliado != null ? projetoAvaliado.getTitulo() : "N/A").append("\n");
        sb.append("  Jurados e Notas:\n");
        if (juradosNotas.isEmpty()) {
            sb.append("    Nenhum jurado na banca.\n");
        } else {
            for (Map.Entry<Jurado, Integer> entry : juradosNotas.entrySet()) {
                sb.append("    - Jurado: ").append(entry.getKey().getNomePessoa())
                  .append(", Nota: ").append(entry.getValue()).append("\n");
            }
        }
        return sb.toString();
    }
}