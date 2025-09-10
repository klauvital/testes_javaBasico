package acesso2;

import acesso1.Aluno;
import acesso1.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Aluno a = new Aluno();

        System.out.println("Dentro da classe Teste (pacote diferente):");
        System.out.println("Public: " + p.nomePublico); // ✅ funciona
        // System.out.println("Protected: " + p.nomeProtegido); // ❌ ERRO: pacote diferente, sem herança direta
        // System.out.println("Default: " + p.nomeDefault); // ❌ ERRO: só pacote1 acessa
        // System.out.println("Private: " + p.nomePrivado); // ❌ ERRO: só a própria classe acessa

        a.acessarAtributos();  // Testa herança
        p.mostrarNomes();      // Mostra todos dentro da própria classe
    }
}