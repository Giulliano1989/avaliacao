
import java.util.*;

public class Questao15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite a  quantidade que vc precisa : ");
        int quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite um numero :");
            numeros.add(input.nextInt());
        }

        ArrayList<Integer> repetidos = new ArrayList<>();
        System.out.println("repeticoes");

        for (int i = 0; i < numeros.size(); i++) {
            int numeroAtual = numeros.get(i);

            int contador = 0;

            if (!repetidos.contains(numeroAtual)) {
                for (int a = 0; a < numeros.size(); a++) {

                    if (numeroAtual == numeros.get(a)) {
                        contador++;
                    }

                }

                System.out.println("numeros digitado " + numeroAtual + "contador " + repetidos);

            }
        }

    }

}
