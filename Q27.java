package listaVetores;

import java.util.Random;

public class Q27 {
    public static void main(String[] args) {
        Random random = new Random();

        int tamVetor = 10;
        int[] vetorA = new int[tamVetor];
        String[] vetorB = new String[tamVetor];

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(20);
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorA[i] < 7) {
                vetorB[i] = "a";
                System.out.print(vetorB[i] + " ");
            } else if (vetorA[i] == 7) {
                vetorB[i] = "b";
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = "c";
                System.out.print(vetorB[i] + " ");
            } else if (vetorA[i] == 10) {
                vetorB[i] = "d";
            } else if (vetorA[i] > 10) {
                vetorB[i] = "e";
                System.out.print(vetorB[i] + " ");
            }
        }
    }
}
