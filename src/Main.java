//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Uma classe de cada arquivo , precisa ser o nome do arquivo
        // declaração de variaveis e tipos

            /* Inteiros

            byte => 8 bits = -128 a 127
            short => 16 bits = -32.768 a 32.767
            int => 32 bits = -2.147.483.648 a 2.147.483.647
            long => 64 bits = -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
            */

           /* Decimais

           float => 32 bits = precisão simples
           double => 64 bits = precisão dupla (várias casas após a virgula)
           */

           /* String é uma classe, para representar frase ou palavras, sempre com aspas duplas
           Ex= String nome = "Claudia";
           char = apenas 1 caracter
           Ex: char c= 'C';
            */

           /* Boolean = 2 tipos : true e false

            */
           byte b = 100;
           short s = 10000;
           int i = 100000;
           long l = 1000000000L; // precisa colocar o L no final
           float f = 1400000.1f; // precisa colocar o f no final
           double d = 14.12345678;
           char c = 'c';
           String str = "abc";
           boolean bool = true;
           System.out.println("d de double = " + d);

        for (int m = 1; m <= 5; m++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("m = " + i);
        }
        int j = 0;
        while (j <= 10) {
            System.out.println("j = " +j);
            j = j + 2;
        }
        int [] idades = {31, 29, 25, 21};
        // For tradicional (usando índice)
        System.out.println("Usando for tradicional:");
        for (int m = 0; m < idades.length; m++) {
            System.out.println("Idade na posição " + m + " = " + idades[m]);
        }

        // For-each (mais simples)
        System.out.println("\nUsando for-each:");
        for (int idade : idades) {
            System.out.println("Idade = " + idade);
        }

        System.out.println("Exemplo usando o Do While");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++; // incrementa k
        } while (k <= 50); // condição

        int soma = 0;
        for (int idade : idades) {
            soma +=  idade;
            System.out.println("Soma = " + soma);
        }
        int soma2 = 0;
        for (int n = 0; n < idades.length; n++) {
            soma2 +=  idades[n];
            System.out.println("Idade na posição " + n + " = " + idades[n]);
        }
        System.out.println("Soma das idades = " + soma2);
    }
}