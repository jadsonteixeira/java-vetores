package listaVetores;

public class Q07 {
    public static void main(String[] args) {
        int tamVetor = 10;
        int[] vetorA = new int[tamVetor];
        int[] vetorB = new int[tamVetor];
        int[] vetorC = new int[tamVetor];

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = i + 1;
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
            System.out.print(vetorC[i] + " ");
        }
    }
}
