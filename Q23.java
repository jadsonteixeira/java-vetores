package listaVetores;

import java.util.Random;

public class Q23 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorA = new int[10];

        System.out.print("Vetor A completo: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(100);
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                break;
            } else {
                System.out.print(vetorA[i] + " ");
            }
        }
    }
}
