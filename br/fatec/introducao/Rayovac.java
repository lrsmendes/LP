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
public class Rayovac {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double raio;
        
        System.out.print("Escreva o raio do seu círculo: ");
        
        raio = leia.nextDouble();
        
        double diametro = (2 * raio);
        double area = (Math.PI * Math.pow(raio, 2));
        double circ = (2 * Math.PI * raio);
        
        System.out.println("\nDiâmetro: " + diametro);
        System.out.println("Área: " + area);
        System.out.println("Cirumferencia: " + circ);
        
    }
    
}
