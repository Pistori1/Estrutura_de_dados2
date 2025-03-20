package Aula03.Ex2;

public class Ex2 {
    public static void main(String[] args) {

            int TAM=50;
            int Media = 0;
            // Media = 0 : 2
            // TAM = 50 : 2

            int Vetor[] = new int[TAM];

            for (int i = 0 ; i < TAM ; i++) {
                // int i = 1 : 2
                // i < TAM : 3*(n+1)
                // i++ : 4*n

                Vetor[i]=1;
                // Vetor[i] = 0 : 5*n
            }

            for (int i = 0 ; i < TAM ; i++) {
                // int i = 1 : 2
                // i < TAM : 3*(n+1)
                // i++ : 4*n

                Media = Vetor[i] + Media;

                // Media = Vetor[i] + Media : 6*n
            }

            Media = Media / TAM;
            // Media = Media / TAM : 4
            System.out.println("Media: " + Media);

            // 18 + 25*n

    }
}
