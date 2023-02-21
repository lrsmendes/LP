package br.fatec.vetores;

import java.util.Scanner;

public class MatrizBidimensionalLinCol {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int lin, col;
        System.out.print("Informe o número de linhas e colunas da matriz: ");
        lin = leia.nextInt();
        col = leia.nextInt();
        
        int[][] mat = new int [lin][col];
        int i, j, k = 0;
        
        for (i = 0; i < lin ; i++){
            for (j = 0; j < col; j++){
                mat[i][j] = k++;
            }
        }
        
        for (i = 0; i < lin; i++){
            for (j = 0; j < col; j++){
                System.out.print(mat[i][j] + "\t");
            }
            
            System.out.println();
        }
        
    }
    
}
