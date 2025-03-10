package Aula02.Ex2;

public class Ex2 {
    public static void main(String[] args) 
    {
        int TAM=50;

        int Vetor[] = new int[TAM];
        int Vetor_copiado[] = new int[TAM];

        
        for(int aux=0;aux<TAM;aux++) 
        {
            // int aux = 0: Sigma rec + Sigma arm
            // aux < TAM: 2* Sigma rec + Sigma <
            // aux++: 2 * Sigma rec + Sigma"+" + Sigma arm

            Vetor[aux]=Vetor_copiado[aux];
            //Vetor[aux]: 3 * Sigma rec + Sigma .
            //Vetor_copiado[aux] lado esquerdo: 2 * Sigma rec + Simga . + Sigma arm

        }
    }
}

// Para TAM = 10 -> 170 Sigmas
// Para TAM = 50 -> 850 Sigmas
// Para TAM = 100 -> 1700 Sigmas
// Para TAM = 500 -> 8500 Sigmas
// Para TAM = 1000 -> 17000 Sigmas
// Para TAM = 5000 -> 85000 Sigmas
// Para TAM = 10000 -> 170000 Sigmas
// Para TAM = 50000 -> 850000 Sigmas
// Para TAM = 100000 -> 1700000 Sigmas
// Para TAM = 500000 -> 8500000 Sigmas