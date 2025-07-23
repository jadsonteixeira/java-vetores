package listaVetores;

import java.util.Random;

public class Q28 {
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
            vetorB[i] = vetorA[vetorA.length - 1 - i];
            System.out.print(vetorB[i] + " ");
        }
    }
}
