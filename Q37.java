package listaVetores;

public class Q37 {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        long[] vetorB = new long[vetorA.length];

        System.out.println("Tabela de fatorial");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
        }

        // calculando a fatorial
        for (int i = 0; i < vetorA.length; i++) {
            long fatorial = 1;

            for (int j = 1; j<= vetorA[i]; j++) {
                fatorial *= j;
            }

            vetorB[i] = fatorial;
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + "! = " + vetorB[i]);
        }
    }
}
