import java.util.*;
public class Questao03{
    public static void main (String [] args ){
        Scanner leitor= new Scanner(System.in);


        System.out.println("Digite um numero :");
        int num1 = leitor.nextInt();

        System.out.println("Digite outro numero :");
        int num2 = leitor.nextInt();

        int soma = num1 + num2;
        int sub  = num1 - num2;
        int div  = num1 / num2;
        int mult = num1 * num2;

        System.out.println("resutado da soma entre os dois valores e " + soma);
        System.out.println("resutado da subtração entre os dois valores e " + sub);
        System.out.println("resutado da divisão entre os dois valores e " + div);
        System.out.println("resutado da mutiplicação entre os dois valores e " + mult);

        leitor.close();


    }
}