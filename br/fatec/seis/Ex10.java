package br.fatec.seis;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        int mat[][] = new int[n][n];

        matrizIdentidade(mat);
        
        System.out.printf("Matriz de ordem %d: \n", n);
        
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                System.out.printf("%d\t", mat[i][j]);           
            }
            System.out.println("");
        }
    }
    
    private static void matrizIdentidade(int [][]matriz) {
        for (int i = 0; i < matriz.length; i++){
            matriz[i][i] = 1; // fiz milagre, acredita
        }
    }
}

