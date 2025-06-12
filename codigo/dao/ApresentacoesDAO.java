//====================================
//  ApresentacoesDAO.java (Singleton)
//====================================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

// Dependencias
import model.Apresentacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ApresentacoesDAO {
    
    // Instância
    private static ApresentacoesDAO instance;

    // Coleção
    private List<Apresentacao> apresentacoes;
    private int nextId = 1;

    // Construtor
    private ApresentacoesDAO() {
        this.apresentacoes = new ArrayList<>();
    }

    // Obter única instância da classe
    public static ApresentacoesDAO getInstance() {
        if (instance == null) {
            instance = new ApresentacoesDAO();
        }
        return instance;
    }


    /**
     * Adiciona uma nova apresentação à coleção.
     * Gera um ID para a apresentação automaticamente.
     * @param apresentacao A apresentação a ser adicionada.
     */
    public void adicionarApresentacao(Apresentacao apresentacao) {
        if (apresentacao != null) {
            apresentacao.setIdApresentacao(nextId++); // Define o ID e incrementa
            this.apresentacoes.add(apresentacao);
            System.out.println("Apresentação do projeto '" + apresentacao.getProjeto().getTitulo() + "' adicionada com ID: " + apresentacao.getIdApresentacao());
        }
    }

    /**
     * Pesquisa uma apresentação pelo seu ID.
     * @param id O ID da apresentação a ser pesquisada.
     * @return A apresentação encontrada ou null se não existir.
     */
    public Apresentacao pesquisarApresentacaoPorId(int id) {
        for (Apresentacao apresentacao : apresentacoes) {
            if (apresentacao.getIdApresentacao() == id) {
                return apresentacao;
            }
        }
        return null;
    }

    /**
     * Retorna uma lista de todas as apresentações.
     * @return Uma lista imutável de apresentações.
     */
    public List<Apresentacao> listarTodasApresentacoes() {
        return Collections.unmodifiableList(apresentacoes);
    }

    /**
     * Retorna uma lista de projetos aprovados (nota final >= 7).
     * @return Uma lista de projetos aprovados.
     */
    public List<Apresentacao> listarProjetosAprovados() {
        // Filtra as apresentações
        // Apresentar em uma nova lista.
        return apresentacoes.stream()
                .filter(apresentacao -> apresentacao.getProjeto() != null && apresentacao.getProjeto().getNotaFinal() >= 7)
                .collect(Collectors.toList());
    }

    /**
     * Remove uma apresentação da coleção pelo seu ID.
     * @param id O ID da apresentação a ser removida.
     * @return true se a apresentação foi removida com sucesso, false caso contrário.
     */
    public boolean removerApresentacao(int id) {
        Apresentacao apresentacaoParaRemover = pesquisarApresentacaoPorId(id);
        if (apresentacaoParaRemover != null) {
            return apresentacoes.remove(apresentacaoParaRemover);
        }
        return false;
    }

}
