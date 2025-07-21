package listaVetores;

public class Q13 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int somaNumMaior5 = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
            System.out.print(vetor[i] + " ");

            if (vetor[i] % 5 == 0) {
                somaNumMaior5 += vetor[i];
            }
        }
        System.out.println();

        System.out.print("Soma dos múltiplos de 5: " + somaNumMaior5);
    }
}
