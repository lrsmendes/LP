//Autor: Lucas Raziel Silva Mendes

/* Escreva um programa em Java que preencha uma matriz de reais n x m com valores aleatórios (use a classe Random), 
 * imprima esta matriz e determine e imprima a posição (linha e coluna) do maior elemento da matriz. 
 */
package br.fatec.vetores;

import java.util.Random;
import java.util.Scanner;

public class Ex2Slide1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe o número de linhas e colunas da matriz: ");
        int n = leia.nextInt();
        int m = leia.nextInt();
        int lin = 0, col = 0;
        
        double[][] mat = new double [n][m];
        
        int i, j;
        
        for (i = 0; i < n ; i++){
            for (j = 0; j < m; j++){
                mat[i][j] = rand.nextDouble();
            }
        }
        
        for (i = 0; i < n; i++){
            for (j = 0; j < m; j++){
                System.out.printf("%.4f\t", mat[i][j]);
                
                if (mat[i][j] > mat[lin][col]){
                lin = i;
                col = j;
                }
            }
            
            System.out.println();
    }
        System.out.printf("Posição do maior elemento da matriz: %d %d\n", lin, col);
    }
    
}
