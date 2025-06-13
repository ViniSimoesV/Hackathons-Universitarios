/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

// Dependencias
import model.Sala;
import model.Pessoa_Profissional;
import model.Universidade;
import model.Projeto;
import model.Equipe;
import model.Empresa;
import model.Apresentacao;
import model.Pessoa_Estudante;
import model.Banca;
import model.Jurado;
import dao.ApresentacoesDAO;
import dao.EquipesDAO;

import java.time.LocalDateTime; 
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Obter as instâncias Singleton dos DAOs
        EquipesDAO equipesDAO = EquipesDAO.getInstance();
        ApresentacoesDAO apresentacoesDAO = ApresentacoesDAO.getInstance();

        System.out.println("--- INÍCIO DO SISTEMA DE GERENCIAMENTO DE HACKATHONS ---");
        System.out.println("\n--- 1. Criação de Dados Iniciais ---");

        // Criar Instituições
        Universidade pucMinas = new Universidade(1, "Pontifícia Universidade Católica de Minas Gerais", "MG", "Belo Horizonte");
        Universidade ufmg = new Universidade(2, "Universidade Federal de Minas Gerais", "MG", "Belo Horizonte");
        Empresa google = new Empresa(3, "Google Brasil");

        // Criar Pessoas (Estudantes, Profissionais, Jurados)
        Pessoa_Estudante estudante1 = new Pessoa_Estudante(1, "Ana Silva", "111.111.111-11", "31988881111", pucMinas, "Engenharia de Software");
        Pessoa_Estudante estudante2 = new Pessoa_Estudante(2, "Bruno Costa", "222.222.222-22", "31988882222", pucMinas, "Ciência da Computação");
        Pessoa_Estudante estudante3 = new Pessoa_Estudante(3, "Carlos Dias", "333.333.333-33", "31988883333", pucMinas, "Sistemas de Informação");
        Pessoa_Estudante estudante4 = new Pessoa_Estudante(4, "Denise Souza", "444.444.444-44", "31988884444", pucMinas, "Engenharia de Software");
        Pessoa_Estudante estudante5 = new Pessoa_Estudante(5, "Eduardo Lima", "555.555.555-55", "31988885555", pucMinas, "Ciência da Computação");
        Pessoa_Estudante estudante6 = new Pessoa_Estudante(6, "Fernanda Alves", "666.666.666-66", "31988886666", ufmg, "Engenharia da Computação");
        Pessoa_Estudante estudante7 = new Pessoa_Estudante(7, "Gustavo Rocha", "777.777.777-77", "31988887777", ufmg, "Ciência da Computação");
        Pessoa_Estudante estudante8 = new Pessoa_Estudante(8, "Helena Gomes", "888.888.888-88", "31988888888", ufmg, "Sistemas de Informação");
        Pessoa_Estudante estudante9 = new Pessoa_Estudante(9, "Igor Pereira", "999.999.999-99", "31988889999", ufmg, "Engenharia da Computação");
        Pessoa_Estudante estudante10 = new Pessoa_Estudante(10, "Julia Santos", "101.101.101-01", "31988880000", ufmg, "Ciência da Computação");

        Pessoa_Profissional prof1 = new Pessoa_Profissional(101, "Dr. João Mello", "111.222.333-44", "31977771111", pucMinas, "Professor");
        Pessoa_Profissional prof2 = new Pessoa_Profissional(102, "Dra. Maria Silva", "555.666.777-88", "31977772222", ufmg, "Professora");

        Jurado jurado1 = new Jurado(201, "Pedro Martins", "001.001.001-01", "31966661111", google, "Engenheiro de Software Sênior", 1);
        Jurado jurado2 = new Jurado(202, "Sofia Ribeiro", "002.002.002-02", "31966662222", google, "Analista de Sistemas Pleno", 2);
        Jurado jurado3 = new Jurado(203, "Mariana Castro", "003.003.003-03", "31966663333", pucMinas, "Professora", 3);
        Jurado jurado4 = new Jurado(204, "Roberto Neves", "004.004.004-04", "31966664444", ufmg, "Pesquisador", 4);
        Jurado jurado5 = new Jurado(205, "Laura Fonseca", "005.005.005-05", "31966665555", google, "Arquiteta de Software", 5);
        Jurado jurado6 = new Jurado(206, "Daniel Alves", "006.006.006-06", "31966666666", google, "Gerente de Projetos", 6);
        Jurado jurado7 = new Jurado(207, "Gabriela Faria", "007.007.007-07", "31966667777", pucMinas, "Coordenadora de Curso", 7);
        Jurado jurado8 = new Jurado(208, "Lucas Soares", "008.008.008-08", "31966668888", ufmg, "Desenvolvedor Sênior", 8);

        // Criar Salas
        Sala sala101 = new Sala(1, "Sala Principal", "Belo Horizonte", "Coracao Eucaristico", "Rua Contagem", 100, 101);
        Sala sala102 = new Sala(2, "Sala Secundária", "Belo Horizonte", "Coracao Eucaristico", "Av. Brasil", 200, 102);


        System.out.println("\n--- 2. Criação e Adição de Equipes (com 5 alunos cada) ---");
        // Cria 2 equipes com 5 alunos cada; 
        Equipe equipe1 = new Equipe(0, "Time Alfa"); 
        equipe1.adicionarMembro(estudante1);
        equipe1.adicionarMembro(estudante2);
        equipe1.adicionarMembro(estudante3);
        equipe1.adicionarMembro(estudante4);
        equipe1.adicionarMembro(estudante5);
        equipesDAO.adicionarEquipe(equipe1); 

        Equipe equipe2 = new Equipe(0, "Time Beta"); 
        equipe2.adicionarMembro(estudante6);
        equipe2.adicionarMembro(estudante7);
        equipe2.adicionarMembro(estudante8);
        equipe2.adicionarMembro(estudante9);
        equipe2.adicionarMembro(estudante10);
        equipesDAO.adicionarEquipe(equipe2); 

        System.out.println("\nEquipes Cadastradas:");
        equipesDAO.listarTodasEquipes().forEach(System.out::println);


        System.out.println("\n--- 3. Adicionar um projeto diferente para cada equipe ---");
        // Adiciona um projeto diferente para cada equipe: 
        Projeto projeto1 = new Projeto(0, "Plataforma de Doações Online", prof1, equipe1); // ID será gerado pelo DAO
        Projeto projeto2 = new Projeto(0, "Sistema de Monitoramento de Qualidade do Ar", prof2, equipe2); // ID será gerado pelo DAO

        System.out.println("\n--- 4. Criar uma banca avaliadora para cada projeto (cada banca deve conter 4 jurados) ---");
        // Criar uma banca avaliadora para cada projeto (cada banca deve conter 4 jurados): 
        Banca banca1 = new Banca(1, projeto1); // ID da banca
        banca1.adicionarJurado(jurado1, 0); // Notas serão dadas durante a avaliação
        banca1.adicionarJurado(jurado2, 0);
        banca1.adicionarJurado(jurado3, 0);
        banca1.adicionarJurado(jurado4, 0);
        System.out.println(banca1);

        Banca banca2 = new Banca(2, projeto2); // ID da banca
        banca2.adicionarJurado(jurado5, 0);
        banca2.adicionarJurado(jurado6, 0);
        banca2.adicionarJurado(jurado7, 0);
        banca2.adicionarJurado(jurado8, 0);
        System.out.println(banca2);


        System.out.println("\n--- 5. Criar Apresentações ---");
        Apresentacao apresentacao1 = new Apresentacao(0, projeto1, banca1, sala101, LocalDateTime.of(2025, 6, 12, 10, 0));
        Apresentacao apresentacao2 = new Apresentacao(0, projeto2, banca2, sala102, LocalDateTime.of(2025, 6, 12, 14, 0));

        apresentacoesDAO.adicionarApresentacao(apresentacao1);
        apresentacoesDAO.adicionarApresentacao(apresentacao2);

        System.out.println("\nApresentações Cadastradas:");
        apresentacoesDAO.listarTodasApresentacoes().forEach(System.out::println);

        System.out.println("\n--- 6. Avaliação dos Projetos (Jurados dão notas) ---");
        // Jurados dão as notas e a banca calcula
        System.out.println("Avaliando Projeto 1: " + projeto1.getTitulo());
        banca1.getJuradosNotas().put(jurado1, 8); // Jurado 1 dá nota 8
        banca1.getJuradosNotas().put(jurado2, 9); // Jurado 2 dá nota 9
        banca1.getJuradosNotas().put(jurado3, 7); // Jurado 3 dá nota 7
        banca1.getJuradosNotas().put(jurado4, 8); // Jurado 4 dá nota 8
        apresentacao1.avaliar(); 
        System.out.println("Nota Final do Projeto 1: " + projeto1.getNotaFinal());

        System.out.println("\nAvaliando Projeto 2: " + projeto2.getTitulo());
        banca2.getJuradosNotas().put(jurado5, 6); // Jurado 5 dá nota 6
        banca2.getJuradosNotas().put(jurado6, 7); // Jurado 6 dá nota 7
        banca2.getJuradosNotas().put(jurado7, 5); // Jurado 7 dá nota 5
        banca2.getJuradosNotas().put(jurado8, 6); // Jurado 8 dá nota 6
        apresentacao2.avaliar(); 
        System.out.println("Nota Final do Projeto 2: " + projeto2.getNotaFinal());

        System.out.println("\n--- 7. Lista os projetos com nota final >= 7 (usar stream) ---");
        // Lista os projetos com nota final >=7 
        List<Apresentacao> projetosAprovados = apresentacoesDAO.listarProjetosAprovados();

        if (projetosAprovados.isEmpty()) {
            System.out.println("Nenhum projeto aprovado (nota final >= 7).");
        } else {
            System.out.println("Projetos Aprovados:");
            projetosAprovados.forEach(apresentacao ->
                System.out.println("- Título: " + apresentacao.getProjeto().getTitulo() +
                                   ", Equipe: " + apresentacao.getProjeto().getEquipe().getNome() +
                                   ", Nota Final: " + apresentacao.getProjeto().getNotaFinal())
            );
        }

        System.out.println("\n--- FIM DO SISTEMA DE GERENCIAMENTO DE HACKATHONS ---");
    }
}
