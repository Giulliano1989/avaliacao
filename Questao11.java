import java.util.*;
public class Questao11 {
    public static void main (String [] args){
        ArrayList<String> lista = new ArrayList<>();

        int [] i = {1,2,3,4,5};

            somaArray(i);

            System.out.println();
                
            

    }

    static int somaArray  (int[] array){
        int soma = 0;
        for (int i = 0 ; i < array.length; i++){
            
            soma += i;

        }
        return;

    }

    
}
