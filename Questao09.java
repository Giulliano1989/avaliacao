import java.util.*;
public class Questao09 {

    public static void main (String [] args){
        Scanner leitor =new Scanner(System.in);

        int maxvalue = 0;
        int minvalue= 0;
        
        for (int i = 1; i <= 10 ; i ++){

            System.out.println("Digite um numero " + i + ":");
             int n = leitor.nextInt();

             if(i == 1){
                maxvalue = n;
                minvalue = n;
             }

             if (n > maxvalue) {
                maxvalue = n;
                
             }

             if( n < minvalue){
                minvalue = n;
             }


        }
        System.out.println("o menor valor e :" + minvalue);
        System.out.println("o maior valor e :" + maxvalue);

        leitor.close();
        

    }
    
}
