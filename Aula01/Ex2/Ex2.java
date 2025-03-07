package Aula01.Ex2;

public class Ex2 {
    public static void main(String[] args) 
    {
        long startTime = System.nanoTime();

        int TAM=50;

        long compar = 0;
        long aritOp = 0;
        int aux;
        int Vetor[] = new int[TAM];
        int Vetor_copiado[] = new int[TAM];

        compar += 1;
        for(aux=0;aux<TAM;aux++) 
        {
            compar += 1;
            aritOp += 1;
            Vetor[aux]=Vetor_copiado[aux];
        }
        
        long endTime = System.nanoTime();
        long timeElapsed= endTime - startTime;
        System.out.println("Quantidade de Comparacoes: " + compar);
        System.out.println("Quantidade de Operacoes Aritimeticas: " + aritOp);
        System.out.println("Tempo de execucao em Nanosegundos: " + timeElapsed);

      System.exit(0);
        
    }
}
