package br.fatec.seis;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Escreva o fator da sua matriz: ");
        int n = leia.nextInt();
        double mat[][] = new double[n][n];
        
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                mat[i][j] = leia.nextDouble();
            }
        }
        
        System.out.print("\nAgora escreva o valor X: ");
        double x = leia.nextDouble(); 
        
        multiplicaMatriz(mat, x);
        
        System.out.printf("A sua matriz multiplicada por %.0f é de: \n", x);
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                System.out.println(mat[i][j]);
            }
        }
    }
    
    private static void multiplicaMatriz(double [][]matriz, double multi){    
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = matriz[i][j] * multi;
            }
        }
    }
}
