package acesso1;

public class Pessoa {
    public String nomePublico = "Nome Público";       // acesso liberado
    protected String nomeProtegido = "Nome Protegido"; // visível no pacote e em subclasses
    String nomeDefault = "Nome Default";              // visível só dentro do pacote
    private String nomePrivado = "Nome Privado";       // só dentro da própria classe

    public void mostrarNomes() {
        System.out.println("Dentro da classe Pessoa:");
        System.out.println("Public: " + nomePublico);
        System.out.println("Protected: " + nomeProtegido);
        System.out.println("Default: " + nomeDefault);
        System.out.println("Private: " + nomePrivado);
    }
}