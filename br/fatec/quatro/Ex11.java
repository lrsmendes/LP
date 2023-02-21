package br.fatec.quatro;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int[] N = new int[20];
        int aux;
        Scanner leia = new Scanner(System.in);
        
        for (int i = 0; i < N.length; i++){
            N[i] = leia.nextInt();
        }
        
        for (int i = 0; i < (N.length / 2); i++){
            aux = N[i];
            N[i] = N[N.length - 1 - i];
            N[N.length - 1 - i] = aux;
        }
        
        for (int i = 0; i < N.length; i++){
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }        
    }
}
