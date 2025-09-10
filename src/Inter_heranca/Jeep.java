package Inter_heranca;

public class Jeep implements Automovel{

    @Override
    public void acelerar() {
        System.out.println("Jeep, acelera a 30km por hora");
    }

    @Override
    public void freiar() {
        System.out.println("Jeep, freia");
    }

    @Override
    public void parar() {
        System.out.println("Jeep, para");

    }
}
