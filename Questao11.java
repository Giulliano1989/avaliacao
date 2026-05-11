
import java.util.*;

public class Questao11 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        int[] i = {1, 2, 3, 4, 5};
        int resultado = somarArray(i);

        System.out.println(resultado);

    }

    public static int somarArray(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {

            soma += numeros[i];

        }
        return soma;
    }

}
