package interfaces;

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante.EstuImpl("Claudia Hernandez", 25, "2025001");
        System.out.println(aluno1);
        aluno1.estudar("Java Orientado a Objetos");
    }
}
