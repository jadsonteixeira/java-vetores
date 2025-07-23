package listaVetores;

public class Q36 {
    public static void main(String[] args) {
        double[] vetor = new double[11];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Math.pow(2, i);
            System.out.printf("2^%d = %.0f\n", i, vetor[i]);
        }
    }
}
