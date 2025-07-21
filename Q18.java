package listaVetores;

import java.util.Random; //classe para gerar números inteiros aleatórios

public class Q18 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[10];

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100 + 1); //gera um inteiro aleatório entre 0 e 99
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        int maior = vetor[0];
        int menor = vetor[0];
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }

        System.out.println("Maior idade: " + maior + " na posição: " + posMaior);
        System.out.println("Menor idade: " + menor + " na posição: " + posMenor);
    }
}
