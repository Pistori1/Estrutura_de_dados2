package Aula02;

public class Ex1 {
    public static void main(String[] args) 
    {

        int TAM=10;
        int Vetor[] = new int[TAM];

        for(int aux=0;aux<TAM;aux++) 
        // int aux = 0: Sigma rec + Sigma arm
        // aux < TAM: 2* Sigma rec + Sigma <
        // aux++: 2 * Sigma rec + Sigma"+" + Sigma arm

        {
            Vetor[aux]=0;
            //Vetor[aux] = 0: 3 * Sigma rec + Sigma . + Sigma arm
        }
    }
}


// Para TAM = 10 -> 140 Sigmas
// Para TAM = 50 -> 700 Sigmas
// Para TAM = 100 -> 1400 Sigmas
// Para TAM = 500 -> 7000 Sigmas
// Para TAM = 1000 -> 14000 Sigmas
// Para TAM = 5000 -> 70000 Sigmas
// Para TAM = 10000 -> 140000 Sigmas
// Para TAM = 50000 -> 700000 Sigmas
// Para TAM = 100000 -> 1400000 Sigmas
// Para TAM = 500000 -> 7000000 Sigmas
