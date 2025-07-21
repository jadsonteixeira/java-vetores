package listaVetores;

import java.util.Random;

public class Q19 {
    public static void main(String[] args) {
        Random random = new Random();
        int qntAlunos = 10;
        double[] nota1 = new double[qntAlunos];
        double[] nota2 = new double[qntAlunos];
        double[] media = new double[qntAlunos];

        System.out.println("Notas dos alunos: ");
        for (int i = 0; i < qntAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < 1; j++) {
                nota1[i] = random.nextDouble(10 + 1);
                nota2[i] = random.nextDouble(10 + 1);
                System.out.printf("Nota 1: %.1f\n", nota1[i]);
                System.out.printf("Nota 2: %.1f\n", nota2[i]);
                media[i] = (nota1[i] + nota2[i]) / 2;
                System.out.printf("Média: %.1f\n", media[i]);

                if (media[i] >= 7.0) {
                    System.out.print("Situação: APROVADO\n");
                } else if (media[i] < 4.0) {
                    System.out.print("Situação: REPROVADO\n");
                } else {
                    System.out.print("Situação: RECUPERAÇÂO\n");
                }
            }
            System.out.println();
        }

        System.out.print("Média das notas: ");
        for (int i = 0; i < media.length; i++) {
            System.out.printf("%.1f ", media[i]);
        }
    }
}
