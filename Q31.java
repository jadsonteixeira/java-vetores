package listaVetores;

public class Q31 {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        int indicePares = 0;
        int indiceImpares;

        // preenchendo vetor B com pares
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[indicePares] = vetorA[i];
                indicePares++;
            }
        }

        indiceImpares = indicePares;

        // preenchendo o vetor B com ímpares
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[indiceImpares] = vetorA[i];
                indiceImpares++;
            }
        }

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
