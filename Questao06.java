import java.util.*;
public class Questao06 {
    public static void main (String [] args) {
        Scanner leitor= new Scanner(System.in);

        System.out.println("Digite um numero");

        int num = leitor.nextInt();

        for(int i = 0 ; i <= num; i++){

            System.out.println(i);
        }

        leitor.close();

    }
    
}
