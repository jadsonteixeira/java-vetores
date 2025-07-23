package listaVetores;

import java.util.Random;

public class Q26 {
    public static void main(String[] args) {
        Random random = new Random();

        int tamVetor = 10;
        int[] vetorA = new int[tamVetor];
        int[] vetorB = new int[tamVetor];
        int[] vetorC = new int[tamVetor];

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(100 + 1);
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = random.nextInt(100 + 1);
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
                System.out.print(vetorC[i] + " ");
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
                System.out.print(vetorC[i] + " ");
            } else if (vetorA[i] < vetorB[i]) {
                vetorC[i] = -1;
                System.out.print(vetorC[i] + " ");
            }
        }
        System.out.println();
    }
}
