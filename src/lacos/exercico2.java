package lacos;

import java.util.Scanner;
import java.util.Locale;

public class exercico2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[3];
        float[] peso =  new float[3];
        float somaNotasPonderadas = 0;
        float somaPeso = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a "+(i+1)+" nota, se decimal usar virgula: ");
            notas[i] = sc.nextFloat();

            System.out.println("Digite o "+(i+1)+ "peso, se decimal usar virgula: ");
            peso[i] = sc.nextFloat();

            somaNotasPonderadas += notas[i] * peso[i];
            somaPeso += peso[i];
        }

        float mediaPonderada = somaNotasPonderadas / somaPeso;
        System.out.printf("Média ponderada: %.2f%n", mediaPonderada);
        if(mediaPonderada > 5.5){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }

        sc.close();
    }
}

