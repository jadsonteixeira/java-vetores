package listaVetores;

public class Q20 {
    public static void main(String[] args) {
        double dollar = 5.50;
        double[] vetorA = new double[20];

        System.out.println("Tabela de cotação do Dólar");
        for (int i = 0; i < 20; i++) {
            vetorA[i] = i + 1;
            System.out.printf("US$%.0f = R$%.2f\n", vetorA[i], (dollar * (i + 1)));
        }
    }
}
