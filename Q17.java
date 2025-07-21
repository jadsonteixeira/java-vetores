package listaVetores;

import java.util.Random; //classe para gerar números aleatórios

public class Q17 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[10];
        int qntIdadesSup35 = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); //gera um número inteiro entre 0 e 99
            System.out.print(vetor[i] + " ");

            if (vetor[i] > 35) {
                qntIdadesSup35++;
            }
        }
        System.out.println();

        System.out.println("Quantidade de pessoas com idade maior que 35 anos: " + qntIdadesSup35);
    }
}
