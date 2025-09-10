package Inter_heranca;

public class AirCross implements Automovel{
    @Override
    public void acelerar() {
        System.out.println("AirCross, acelerando a 50km por hora");
    }

    @Override
    public void freiar() {
        System.out.println("AirCross, freia");
    }

    @Override
    public void parar() {
        System.out.println("AirCross, para");
    }
}
