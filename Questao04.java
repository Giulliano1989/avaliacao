import java.util.*;
public class Questao04 {
    public static void main (String [] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade :");

        int idade = leitor.nextInt();

        if(idade >= 18){
            System.out.println("voce e maior de idade");
        }
        else{
            System.out.println("voce e menor de idade ");
        }
    }
    
}
