package listaVetores;

public class Q01 {
    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i];
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
