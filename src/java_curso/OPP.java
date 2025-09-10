package  java_curso;

public class OPP{
    //classe vai definir os atributos e metódos dos objetos
    //Construtor é um metodo especial da classe , ele é chamado toda vez que é criado o objeto
    //método Main será acionado quando a classe for executada, método de entrada da classe
    public static void main(String[] args) {
       Carro meuCarro = new Carro("BMW");
       Carro meuCarro1 = new Carro("Citroen");
       Carro meuCarro2 = new Carro("Hynday");

       meuCarro1.acelerar();
       meuCarro2.parar();
       String result = meuCarro2.parar();
       System.out.println(result);

    }
}
// metodo construto da classe Carro
class Carro {
    String marca;
    public Carro(String marca) {
        this.marca = marca;
        System.out.println("Carro Criado: " + this.marca);
    }
    public void acelerar() {
        System.out.println("Carro acelerado: " + this.marca);

    }
    public String parar() {
        System.out.println("Carro acelerado: " + this.marca);
        return "Carro parado";

    }


}
