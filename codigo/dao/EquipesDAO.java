//==============================
//  EquipesDAO.java (Singleton)
//==============================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

// Dependencias
import model.Equipe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EquipesDAO {
    
    // instancia
    private static EquipesDAO instance;
    
    // coleção
    private List<Equipe> equipes;
    private int nextId = 1;
    
    // Construtor
    private EquipesDAO() {
        this.equipes = new ArrayList<>();
    }
    
    // Obter única instância
    public static EquipesDAO getInstance() {
        if (instance == null) {
            instance = new EquipesDAO();
        }
        return instance;
    }
    
    /**
     * Adiciona uma nova equipe à coleção.
     * Gera um ID para a equipe automaticamente.
     * @param equipe A equipe a ser adicionada.
     */
    public void adicionarEquipe(Equipe equipe) {
        if (equipe != null) {
            equipe.setIdEquipe(nextId++);
            this.equipes.add(equipe);
            System.out.println("Equipe '" + equipe.getNome() + "' adicionada com ID: " + equipe.getIdEquipe());
        }
    }

    /**
     * Pesquisa uma equipe pelo seu ID.
     * @param id O ID da equipe a ser pesquisada.
     * @return A equipe encontrada ou null se não existir.
     */
    public Equipe pesquisarEquipePorId(int id) {
        for (Equipe equipe : equipes) {
            if (equipe.getIdEquipe() == id) {
                return equipe;
            }
        }
        return null;
    }


    /**
     * Retorna uma lista de todas as equipes.
     * @return Uma lista imutável de equipes.
     */
    public List<Equipe> listarTodasEquipes() {
        return Collections.unmodifiableList(equipes); // Retorna uma cópia
    }
    
    
    /**
     * Remove uma equipe da coleção pelo seu ID.
     * @param id O ID da equipe a ser removida.
     * @return true se a equipe foi removida com sucesso, false caso contrário.
     */
    public boolean removerEquipe(int id) {
        Equipe equipeParaRemover = pesquisarEquipePorId(id);
        if (equipeParaRemover != null) {
            return equipes.remove(equipeParaRemover);
        }
        return false;
    }

}
