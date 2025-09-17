package logicaJava.modulo2;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String cpf;



    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Nome " + nome +"\nIdade: " +idade+"\nPeso: "+peso+"\nAltura: " +altura+"\nCPF: " +cpf;
    }
}


