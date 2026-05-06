import java.util.*;

public class Questao05 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota :");

        int nota1 = leitor.nextInt();

        System.out.println("Digite a segunda nota :");

        int nota2 = leitor.nextInt();

        System.out.println("Digite a terceira nota :");

        int nota3 = leitor.nextInt();

        int soma = nota1 + nota2 + nota3;
        int media = soma / 3;

        System.out.println("Primeira nota e :" + nota1);
        System.out.println("Segunda  nota e :" + nota2);
        System.out.println("Terceira nota e :" +nota3);

        if (media >= 7) {
            System.out.println("Aprovado");
            
        }
        else{
            System.out.println("Reprovado");
        }

        leitor.close();

    }

}
