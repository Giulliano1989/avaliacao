
import java.util.*;

public class Questao12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero :");
            numeros[i] = input.nextInt();

        }
        System.out.println("Exibindo numeros pares entre os digitados :");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }

        }
    }

}
