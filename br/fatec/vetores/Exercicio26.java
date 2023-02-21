package br.fatec.vetores;

import java.util.Scanner;

public class Exercicio26 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        int n = leia.nextInt(), m = leia.nextInt();
        int[][] handebol = new int [n][m];
        
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j++){
                handebol [i][j] = leia.nextInt();
            }
        }
        int jogadores = 0;
        for (int i = 0; i < n; i++){
            int j = 0;
            
            for (j = 0; j < m; j++){
                if (handebol[i][j] == 0){
                    break;
                }
            }
            
            if (j == m){
                jogadores++;
            }
        }
        
        System.out.println("\n" + jogadores);
    }
    
}