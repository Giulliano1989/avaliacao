

public class Questao08 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += i; //adicionado o += para que ele some todos valores
        }
        System.out.println(soma);
    }
}

// O resultado vai ser 10, pq o dentro do bloco for soma vai ser igual ao i e o println fora do  bloco printando o ultimo valor
