package listaVetores;

public class Q15 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int qntPares = 0;
        int qntImpares = 0;
        double percPares = 0;
        double percImpares = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 1;
            System.out.print(vetor[i] + " ");

            if (vetor[i] % 2 == 0) {
                qntPares++;
            } else {
                qntImpares++;
            }
        }
        System.out.println();

        percPares = (qntPares * 100) / 10;
        percImpares = (qntImpares * 100) / 10;

        System.out.println("Percentual de números pares: " + percPares + "%");
        System.out.println("Percentual de número ímpares: " + percImpares + "%");
    }
}
