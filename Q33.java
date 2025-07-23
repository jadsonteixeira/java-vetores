package listaVetores;

public class Q33 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        // preenchendo o vetor
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
        }

        // verificando se os valores são primos
        for (int i = 0; i < vetorA.length; i++) {
            boolean primo = true;

            if (vetorA[i] <= 1) {
                primo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(vetorA[i]); j++) {
                    if (vetorA[i] % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            System.out.print("vetorA[" + i + "] = " + vetorA[i] + ": ");
            if (primo) {
                System.out.println("É primo");
            } else {
                System.out.println("Não é primo");
            }
        }
    }
}
