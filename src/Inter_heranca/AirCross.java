package Inter_heranca;

public class AirCross implements Automovel{
    final int limite_velocidade = 150;
    int velocidade_atual = 100;


    @Override
    public void acelerar() {
        if(this.velocidade_atual < this.limite_velocidade) {
            System.out.println("AirCross, acelerando " +velocidade_atual + " por hora");
            this.velocidade_atual += 10;
        }
        else {
            System.out.println("AirCross atingiu o limite de velocidade máxima "+this.limite_velocidade );

        }


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
