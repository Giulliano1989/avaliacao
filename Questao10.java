import java.util.*;
public class Questao10 {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        
       while (true) {
        System.out.println("Digite um valor :");
         int num = leitor.nextInt();

         if (num == 0) {
            break;
         }

         i += num;

        
       }
       System.out.println("A soma dos valores  digitado e "+ i);
       leitor.close();
    }
}
