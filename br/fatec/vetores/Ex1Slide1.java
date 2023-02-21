//Autor: Lucas Raziel Silva Mendes

/* Escreva um programa em Java que preencha uma matriz de inteiros n x m com valores aleatórios
 * (use a classe Random), imprima esta matriz e calcule e imprima o somatório dos elementos da matriz.
 */

package br.fatec.vetores;

import java.util.Random;
import java.util.Scanner;

public class Ex1Slide1 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe o número de linhas e colunas da matriz: ");
        int n = leia.nextInt();
        int m = leia.nextInt();
        
        int[][] mat = new int [n][m];
        
        int i, j, soma = 0;
        
        for (i = 0; i < n ; i++){
            for (j = 0; j < m; j++){
                mat[i][j] = rand.nextInt(25);
            }
        }
        
        for (i = 0; i < n; i++){
            for (j = 0; j < m; j++){
                System.out.print(mat[i][j] + "\t");
                soma = soma + mat[i][j];
            }
            
            System.out.println();
    }
    
       System.out.println("\nSoma: " + soma);
  }

}