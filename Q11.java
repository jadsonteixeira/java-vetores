package listaVetores;

public class Q11 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int qntPares = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
            System.out.print(vetor[i] + " ");
            if (vetor[i] % 2 == 0) {
                qntPares++;
            }
        }
        System.out.println();

        System.out.println("Quantidade de números pares: " + qntPares);
    }
}
