
import java.util.*;

public class Questao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Quantos valores voce precisa :");
        int quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite um valor :");

            numeros.add(input.nextInt());

        }

    }
}
