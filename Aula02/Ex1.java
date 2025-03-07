package Aula02;

public class Ex1 {
    public static void main(String[] args) {

        int TAM=10;
        int aux;
        int Vetor[] = new int[TAM];

      
        for(aux=0;aux<TAM;aux++) {
            // int aux = 0: Sigma rec + Sigma arm
            // aux < TAM: 2* Sigma rec + Sigma <
            // aux++: 2 * Sigma rec + Sigma"+" + Sigma arm

            Vetor[aux]=0;
            //Vetor[aux] = 0: 3 * Sigma rec + Sigma . + Sigma arm
        }
    }
}

