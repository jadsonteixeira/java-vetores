package listaVetores;

public class Q02 {
    public static void main(String[] args) {
        int tamVetor = 8;
        int[] vetorA = new int[tamVetor];
        int[] vetorB = new int[tamVetor];

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * 2;
            System.out.print(vetorB[i] + " ");
        }
    }
}
