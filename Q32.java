package listaVetores;

public class Q32 {
    public static void main(String[] args) {
        int[] vetor = new int[5];

        for (int i = 1; i <= vetor.length; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
