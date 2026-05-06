import java.util.*;

public class Questao07 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero :");

        int n = leitor.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++) {

            soma += i;

        }
        System.out.println(soma);

        leitor.close();
    }

}
