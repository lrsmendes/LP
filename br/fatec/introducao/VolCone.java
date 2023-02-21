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
public class VolCone {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Escreva o raio da base do cone: ");
        
        double raio = leia.nextDouble();
        
        System.out.print("Agora escreva a sua altura: ");
        
        double altura = leia.nextDouble();
        
        double area = (Math.PI * Math.pow(raio, 2));
        
        double volume = (area * altura) / 3;
        
        System.out.println("\nO volume do seu cone é de: " + volume);

    }
    
}
