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
public class Aritimetica {
    
    public static void main(String[] args) {
            
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Escreva a primeira nota: ");
        
        double n1 = leia.nextDouble();
        
        System.out.print("Escreva a segunda nota: ");
        
        double n2 = leia.nextDouble();
        
        double media = (n1 + n2) / 2;
        
        System.out.println("\nMédia aritimética: " + media);
    }
}
