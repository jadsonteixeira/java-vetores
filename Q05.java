package listaVetores;

public class Q05 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * i;
            System.out.print(vetorB[i] + " ");
        }
    }
}
