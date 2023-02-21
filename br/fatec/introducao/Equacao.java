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
public class Equacao {
    
    public static void main(String[] args) {
        double a, b, c, d, x1, x2;
        
        System.out.println("EQUAÇÃO --- (c)Raziel, '22");
        System.out.println("");
        System.out.print("Escreva o valor de A: ");
        
        Scanner leia = new Scanner(System.in);
        
        a = leia.nextDouble();
        
        System.out.println("");
        
        System.out.print("Escreva o valor de B: ");
        
        b = leia.nextDouble();
        
        System.out.println("");
        
        System.out.print("Escreva o valor de C: ");
        
        c = leia.nextDouble();

        d = Math.pow(b, 2) - 4 * a * c;
        
        System.out.println("");
       
        if (d < 0) {
        
            System.out.println("Não há solução real!");
        }
        
        else {  
      
        if (d > 0) {
            
        x1 = (-b + Math.sqrt(d)) / 2 * a;
        x2 = (-b - Math.sqrt(d)) / 2 * a;
        
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);         
            }
        
        else {
            x1 = -b / 2 * a;
            x2 = -b / 2 * a;
            
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
            
        }
        
        }
        
    }
    
}

  