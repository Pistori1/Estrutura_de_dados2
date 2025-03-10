package Aula02.Ex4;

public class Ex4 {

    public static void main(String[] args) {

        int aux = 10;
        int aux_2 = aux;

        double[][] Matriz = new double[aux][aux_2];
        double[][] Matriz_Transposta = new double[aux_2][aux];

        for (int i = 0; i < aux; i++) {
            //int i = 0 : Sigma rec + Sigma arm
            //i < aux : 2* Sigma rec + Sigma <
            //i++ : 2* Sigma rec + sigma "+" + Sigma arm

            for (int j = 0; j < aux_2; j++) {
                //int j = 0 : Sigma rec + Sigma arm
                //j < aux : 2* Sigma rec + Sigma <
                //j++ : 2* Sigma rec + sigma "+" + Sigma arm
                
                Matriz[i][j] = -1;
                // Matriz[i][j] = -1: 4 * Sigma rec + Sigma . + Sigma arm
            }
        }

		for(int i = 0; i < aux; i++) { 
            //int i = 0 : Sigma rec + Sigma arm
            //i < aux : 2* Sigma rec + Sigma <
            //i++ : 2* Sigma rec + sigma "+" + Sigma arm

            for(int j = 0; j < aux_2; j++) {
                //int j = 0 : Sigma rec + Sigma arm
                //j < aux : 2* Sigma rec + Sigma <
                //j++ : 2* Sigma rec + sigma "+" + Sigma arm

                Matriz_Transposta[j][i]=Matriz[i][j];   
                // Matriz_Transposta[j][i]: 3 * Sigma rec + Sigma . 
                // Matriz[i][j]: 3 * Sigma rec + Sigma . + Sigma arm
            }
        }
        
        for(int i = 0; i < aux; i++) {  
            //int i = 0 : Sigma rec + Sigma arm
            //i < aux : 2* Sigma rec + Sigma <
            //i++ : 2* Sigma rec + sigma "+" + Sigma arm

            for(int j = 0; j < aux_2; j++) {
                //int j = 0 : Sigma rec + Sigma arm
                //j < aux : 2* Sigma rec + Sigma <
                //j++ : 2* Sigma rec + sigma "+" + Sigma arm
                
                if(Matriz[i][j] != Matriz_Transposta[j][i]){
                    // Matriz[i][j] != : 3 * Sigma rec + Sigma . + Sigma <
                    // Matriz_Transposta[j][i]: 3 * Sigma rec + Sigma . 

                    System.out.println("A matriz nao e igual a anterior");

                    break;
                }
            }
        }
    }
}

// Para TAM = 10, TAM2 = 10 -> 3766 Sigmas  
// Para TAM = 50, TAM2 = 50 -> 92806 Sigmas  
// Para TAM = 100, TAM2 = 100 -> 370606 Sigmas  
// Para TAM = 500, TAM2 = 500 -> 9253006 Sigmas  
// Para TAM = 1000, TAM2 = 1000 -> 37006006 Sigmas  
// Para TAM = 5000, TAM2 = 5000 -> 925030006 Sigmas  
// Para TAM = 10000, TAM2 = 10000 -> 3700060006 Sigmas  
// Para TAM = 50000, TAM2 = 50000 -> 92500300006 Sigmas  
// Para TAM = 100000, TAM2 = 100000 -> 370000600006 Sigmas  
// Para TAM = 500000, TAM2 = 500000 -> 9250003000006 Sigmas  
