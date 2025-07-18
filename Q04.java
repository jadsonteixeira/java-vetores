package listaVetores;

public class Q04 {
    public static void main(String[] args) {
        int tamVetor = 15;
        int[] vetorA = new int[tamVetor];
        double[] vetorB = new double[tamVetor];

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.printf("%.2f ", vetorB[i]);
        }
    }
}
