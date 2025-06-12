//==================================
//  Empresa.java  <<extends>>
//==================================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Empresa extends Instituicao {
    
    // Construtor
    public Empresa(int idInstituicao, String nomeInstituicao) {
        super(idInstituicao, nomeInstituicao);
    }

    @Override
    public String toString() {
        return "Empresa - " + super.toString();
    }
}