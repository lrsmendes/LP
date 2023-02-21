package br.fatec.vetores;

import java.util.Scanner;

public class Exercicio20 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe a ordem do triângulo de Pascal (max. 20): ");
        
        int n = leia.nextInt();
        
        while (n < 2 || n > 20){
            System.out.println("Erro: A ordem do seu triângulo deve ser entre 2 e 20!");
            System.out.print("Informe a ordem do triângulo de Pascal (max. 20): ");
            n = leia.nextInt();
        }
        
        int[][] pascal = new int [n][];
        System.out.println("Triângulo de Pascal de ordem " + n);
        
        for (int i = 0; i < n; i++){
            pascal[i] = new int [i + 1];
            for (int j = 0; j < i + 1; j++){
                if (j == 0 || i == j){
                    pascal[i][j] = 1;
                }
                else {
                    pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
                }
                System.out.print(pascal[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}