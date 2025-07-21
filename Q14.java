package listaVetores;

public class Q14 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        double media = 0;
        int somaImpares = 0;
        int qntImpares = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
            System.out.print(vetor[i] + " ");

            if (vetor[i] % 2 != 0) {
                somaImpares += vetor[i];
                qntImpares++;
            }
            media = (somaImpares / qntImpares);
        }
        System.out.println();

        System.out.println("Quantidade de ímpares: " + qntImpares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
        System.out.println("Média dos números ímpares: " + media);
    }
}
