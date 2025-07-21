package listaVetores;

public class Q16 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int somaInf15 = 0;
        int qntIguais15 = 0;
        double somaSup15 = 0;
        double qntSup15 = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 3;
            System.out.print(vetor[i] + " ");

            if (vetor[i] < 15) {
                somaInf15 += vetor[i];
            } else if (vetor[i] == 15) {
                qntIguais15++;
            } else {
                somaSup15 += vetor[i];
                qntSup15++;
            }
        }
        System.out.println();

        System.out.println("Soma dos números inferiores a 15: " + somaInf15);
        System.out.println("Quantidade de números iguais a 15: " + qntIguais15);
        System.out.println("Média dos números maiores que 15: " + (somaSup15 / qntSup15));
    }
}
