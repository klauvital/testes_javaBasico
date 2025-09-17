package logicaJava.Modulo1;

public class exercicio1 {
    // while e do while, for, for eatch, break e continue
    public static void main(String[] args) {
   /*   int i = 0;
        while (i <= 7) {
            System.out.println("O valor de i: "+i);
            i++;
        }


        int j = 10;
        do {
            System.out.println("O valor de j: "+j);
            j++;
            if (j == 12) {
                break; // termina o laço
            }

        }while(j<15);


        int k = 0;
        for(k=0;k<10;k++){
            if(k==5){
                continue; // não imprime o 5
            }
            System.out.println("O valor de k: "+k);
        }*/
        // 0   1  2  3  4  5
        int numeros[] = {10, 5, 8, 7, 9, 16};
        for (int i : numeros) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            } else {
                System.out.println("Impar: " + i);
            }

/*
        //array ou vetores
        int[] idades = new int[5];
        idades[1] = 10;
        idades[2] = 20;
        idades[3] = 30;
        System.out.println("Idade na posição 2: "+idades[2]);

        int idades[] = {10,20,30,40,50,60,70,80,90,100};
        for (int i=0;i<idades.length;i++){
            System.out.println("Idade na posição: "+idades[i];
        }

        int[] numeros = {1, 2, 3, 4, 5, 6};
        int contador = 0;
        for (int numero : numeros) {
            if (contador == 3) {
                System.out.println("Posicao 3: " +numero);
            }
            contador++;
        }*/
        }
    }
}
