package acesso1;

public class Aluno extends Pessoa {
    public void acessarAtributos() {
        System.out.println("Dentro da classe Aluno (subclasse, mesmo pacote):");
        System.out.println("Public: " + nomePublico);
        System.out.println("Protected: " + nomeProtegido);
        System.out.println("Default: " + nomeDefault);
        // System.out.println("Private: " + nomePrivado); // ❌ ERRO: não acessível
    }
}
