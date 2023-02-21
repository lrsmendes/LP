/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.introducao;

import java.util.Scanner;

/**
 *
 * @author Fatec
 */
public class Vetor {
    
    public static void main(String[] args) {
        int Vet[][] = new int [10][10];
        
        System.out.println("Escreva alguma coisa: ");
        
        Scanner leia = new Scanner(System.in);
        
        for (int i = 0; i < 9; i++){
            
        Vet[i][0] = leia.nextInt();
        
        
        }
        
           for (int i = 0; i < 9; i++)
           {
                System.out.println(Vet[i][0]);
        
           }
    }
    
}
