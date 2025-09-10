//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        int j = 0;
        while (j <= 10) {
            System.out.println("j = " +j);
            j = j + 2;
        }
        int [] idades = {31, 29, 25, 21};
        // For tradicional (usando índice)
        System.out.println("Usando for tradicional:");
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Idade na posição " + i + " = " + idades[i]);
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
        for (int i = 0; i < idades.length; i++) {
            soma2 +=  idades[i];
            System.out.println("Idade na posição " + i + " = " + idades[i]);
        }
        System.out.println("Soma das idades = " + soma2);
    }
}