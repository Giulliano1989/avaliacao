
import java.util.*;

public class Questao14 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(1);
        numeros.add(5);
        numeros.add(5);
        numeros.add(8);
        numeros.add(8);

        ArrayList<Integer> unicos = new ArrayList<>();

        for (int numero : numeros) {
            if (!unicos.contains(numero)) {
                unicos.add(numero);

            }

        }
        System.out.println("Lista se numeros repetidos");
        System.out.println(unicos);
    }

}
