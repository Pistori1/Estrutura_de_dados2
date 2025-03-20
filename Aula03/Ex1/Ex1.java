package Aula03.Ex1;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        int fatorial = 1;
        // int fatorial : 2

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();
        // int n : 2

        for ( int i = 1; i<=n; i++) {
            fatorial = fatorial*i;
        }

        // int i = 1 : 2
        // i <= n : 3*(n+1)
        // i++ : 4*n
        // fatorial = fatorial * i : 4*n
        // 9 + 11n

        System.out.println("O fatorail e: " + fatorial);
    }
}

