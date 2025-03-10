package Aula02.Ex3;

public class ex_3 {
        public static void main(String[] args) {
            
            int TAM=10;
            int TAM2=10;

            double Matriz[][] = new double[TAM][TAM2];

            for (int aux = 0; aux < TAM; aux++) {
                // int aux = 0: Sigma rec + Sigma arm
                // aux < TAM: 2* Sigma rec + Sigma <
                // aux++: 2 * Sigma rec + Sigma"+" + Sigma arm

                for (int aux_2 = 0; aux_2 < Matriz[aux].length; aux_2++) {
                // int aux_2 = 0: Sigma rec + Sigma arm
                // aux_2 < TAM: 2* Sigma rec + Sigma <
                // aux_2++: 2 * Sigma rec + Sigma"+" + Sigma arm

                Matriz[aux][aux_2] = -1;
                // Matriz[aux][aux_2] = -1: 4 * Sigma rec + Sigma . + Sigma arm
            }
        }
    }
}

// Para TAM = 10, TAM2 = 10 -> 2400 Sigmas
// Para TAM = 50, TAM2 = 75 -> 90000 Sigmas
// Para TAM = 100, TAM2 = 300 -> 720000 Sigmas
// Para TAM = 500, TAM2 = 200 -> 2400000 Sigmas
// Para TAM = 1000, TAM2 = 1000 -> 24000000 Sigmas
// Para TAM = 5000, TAM2 = 7000 -> 840000000 Sigmas
// Para TAM = 10000, TAM2 = 1 -> 240000 Sigmas
// Para TAM = 50000, TAM2 = 25000 -> 30000000000 Sigmas
// Para TAM = 100000, TAM2 = 100000 -> 240000000000 Sigmas
// Para TAM = 500000, TAM2 = 1000 -> 12000000000 Sigmas