package listaVetores;

import java.util.Random;

public class Q25 {
    public static void main(String[] args) {
        Random random = new Random();

        int tamVetor = 10;
        int[] vetorA = new int[tamVetor];
        int[] vetorB = new int[tamVetor];

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(100);
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
            System.out.print(vetorB[i] + " ");
        }
    }
}
