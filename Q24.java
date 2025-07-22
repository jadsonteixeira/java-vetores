package listaVetores;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite os 10 números do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        boolean isPalindromo = true;

        for (int i = 0; i < vetor.length / 2; i++) {
            if (vetor[i] != vetor[vetor.length - 1 - i]) {
                isPalindromo = false;
                break;
            }
        }

        if (isPalindromo) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }

        sc.close();
    }
}
