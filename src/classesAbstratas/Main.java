package classesAbstratas;
// classes abstratas não podem ser instanciadas
// somente classes abstratas podem ter métodos abstratos
public class Main {
    public static void main(String[] args) {
        SerVivo humano = new Humano();
        humano.respirar();
    }
}
