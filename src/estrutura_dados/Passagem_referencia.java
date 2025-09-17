package estrutura_dados;

public class Passagem_referencia {
   private static void calcular(int[] numeros){
       for(int i=0; i<numeros.length;i++){
           numeros[i]*=10;
       }
   }

   public static void main(String[] args){
       int[] identificadores = {6, 2, -1, 4, 5};
       for(int i=0; i<identificadores.length;i++){
           System.out.println(identificadores[i]);
       }
       calcular(identificadores);
       for(int i=0; i<identificadores.length;i++){
           System.out.println(identificadores[i]);
       }
   }
}
