
import java.util.*;

public class Questao13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 5 numeros : ");

        for (int i = 0; i < 5; i++) {

            System.out.println("numero " + (i + 1) + ":");
            numeros.add(input.nextInt());
        }

        numeros.removeIf(numero -> numero < 0);

        System.err.println("Restante da lista: ");

        for (int numero : numeros) {
            System.out.println(numeros);
        }
        input.close();

    }

}
