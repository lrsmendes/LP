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
public class Eleitor {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Escreva a sua idade: ");
        
        
        int idade = leia.nextInt();
        
        System.out.println("");
        
        if (idade < 16){
            
            System.out.println("Você não pode votar!");
        }
        
        else {
            if (idade < 18 || idade >= 65)
            
            {
                System.out.println("O seu voto é facultativo!");
            }
            
            else {
                
                System.out.println("O seu voto é obrigatorio!");
            }
                
        }
        
        }
        
    }
    

