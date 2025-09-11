package classesAbstratas;
// classes abstratas não podem ser instanciadas
// somente classes abstratas podem ter métodos abstratos como tb metodos nao abstratos
public abstract class SerVivo {
    protected  int idade;

    public SerVivo(int idade) {
        this.idade = idade;
    }

    public abstract void respirar();


    public void dormir(){
        System.out.println("SerVivo dormindo");
    }
}
