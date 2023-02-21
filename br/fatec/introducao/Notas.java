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
public class Notas {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double P1, P2, T1, T2, MAR, media; 
        
        System.out.println("1 - Linguagens de Programação (Ciro)");
        System.out.println("2 - Engenharia de Software I (Gilmar)");
        
        int CASO = leia.nextInt();
        
        switch (CASO){
        
            case 1:
        System.out.print("\nP1: ");
        
        P1 = leia.nextDouble();
        
        System.out.print("P2: ");
        
        P2 = leia.nextDouble();
        
        System.out.print("T1: ");
        
        T1 = leia.nextDouble();
        
        System.out.print("T2: ");
        
        T2 = leia.nextDouble();
        
        MAR = 0;
        
        media = (((P1+P2)/2) * 0.6 +((T1+2*T2)/3) * 0.4 + MAR);
        
        System.out.println("Sua média é: " + media);
        
        if (media < 6){
            System.out.println("SE FUDEU!");
            
            //vou precisar de 7 na p2...
        }
        
        break;
        
            case 2:
        System.out.print("\nP1: ");
        
        P1 = leia.nextDouble();
        
        System.out.print("P2: ");
        
        P2 = leia.nextDouble();
        
        System.out.print("TP: ");
        
        T1 = leia.nextDouble();
        
        media = (P1+P2+T1)/3;
        
        System.out.println("Sua média é: " + media);
        
        if (media < 6){
            System.out.println("SE FUDEU!");
            
            //tranquilo...
        }
        
         break;
         
             default:
                System.out.println("INVALIDO!");
                break;
                     }
    
    }
    
}