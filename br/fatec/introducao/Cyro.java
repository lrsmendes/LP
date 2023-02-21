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
public class Cyro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int idade;

        System.out.print("Informe a sua idade: ");
        
        idade = leia.nextInt();
        
        System.out.println("");
       
       if (idade < 16) {
           System.out.println("Você não pode votar. Vaza.");
       }
       
       else {
           
           if (idade < 18 || idade >= 65) 
           {
               System.out.println("Voto facultativo.");
           }
           
           else {
               
               System.out.println("Voto obrigatório.");
           }
           
           if (idade == 56) {
               System.out.println("56!!! ENÉAS PORRA. *dun dun dun dunnnnnn*");
           }
                    
           } // real clean... like that style.
        }
    }
    

