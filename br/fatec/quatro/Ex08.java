package br.fatec.quatro;

import java.util.Scanner;
import java.util.Random;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int dado[] = new int[leia.nextInt()], 
        c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;
        Random aleatorio = new Random();
        
        for (int i = 0; i < dado.length; i++){
            dado[i] = aleatorio.nextInt(6) + 1;
        }
        
        for (int i = 0; i < dado.length; i++){
            System.out.printf("%d ", dado[i]);
      
        }
        System.out.println();
        
        for (int i = 0; i < dado.length; i++){
                
                if (dado[i] == 1){
                    c1 = c1 + 1;
                }
                if (dado[i] == 2){
                    c2 = c2 + 1;
                }
                if (dado[i] == 3){
                    c3 = c3 + 1;
                }
                if (dado[i] == 4){
                    c4 = c4 + 1;
                }
                if (dado[i] == 5){
                    c5 = c5 + 1;
                }
                
                if (dado[i] == 6){
                    c6 = c6 + 1;
            }
        }   
        
        int resultado[] = {c1, c2, c3, c4, c5, c6};
        for (int i = 0; i < 6; i++){
            System.out.printf("A face %d teve %d ocorrências.\n", i+1, resultado[i]);
        }
    }
    
}
