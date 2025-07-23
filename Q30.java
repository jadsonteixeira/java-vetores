package listaVetores;

import java.util.Random;

public class Q30 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(100);
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = vetorA[i];
                System.out.print(vetorB[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorC[i] = vetorA[i];
                System.out.print(vetorC[i] + " ");
            }
        }
    }
}
