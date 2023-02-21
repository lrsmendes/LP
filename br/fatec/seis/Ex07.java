package br.fatec.seis;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Escreva a qtn. de inteiros: ");
        int n = leia.nextInt();
        int mat[][] = new int[n][n];
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = leia.nextInt();
            }
        }
        
        if (éMatriz(mat)){
            System.out.println("Ela é uma matriz triangular.");
        }
        
        else{
            System.out.println("Não é.");
        }
        
    }
    
    private static boolean éMatriz (int [][]vet){
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet[i].length; j++) {
                if (j > i) {
                    if (vet[i][j] == 0) {
                        return false;
                    }
                }
                
                else {
                    if (vet[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
