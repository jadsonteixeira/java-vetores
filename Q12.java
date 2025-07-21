package listaVetores;

public class Q12 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int somaVetor = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
            System.out.print(vetor[i] + " ");
            somaVetor += vetor[i];
        }
        System.out.println();

        System.out.print("Soma dos valores do vetor: " + somaVetor);
    }
}
