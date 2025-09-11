package classesAbstratas;

public class Humano extends SerVivo{

    public Humano(){
        super(58);
    }

    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Humano respirando");
    }


}
