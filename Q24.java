package listaVetores;

public class Q24 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor ao contrário: ");
        for (int i = vetor.length; i > vetor.length; i--) {
            System.out.print(i + " ");
        }
    }
}
