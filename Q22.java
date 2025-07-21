package listaVetores;

import java.util.Random;

public class Q22 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[10];
        int qnt0 = 0;
        int qnt1 = 0;
        double perc0 = 0;
        double perc1 = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(2);
            System.out.print(vetor[i] + " ");

            if (vetor[i] == 0) {
                qnt0++;
            } else {
                qnt1++;
            }
        }
        System.out.println();

        perc0 = (qnt0 * 100) / 10;
        perc1 = (qnt1 * 100) / 10;

        System.out.printf("Percentual de 0s: %.1f%%\n", perc0);
        System.out.printf("Percentual de 1s: %.1f%%\n", perc1);
    }
}
