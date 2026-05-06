import java.util.Scanner;
public class Questao02{
    public static void main (String [] args ){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = leitor.nextLine();

        System.out.println("ola, " + nome);

        leitor.close();



    }
}