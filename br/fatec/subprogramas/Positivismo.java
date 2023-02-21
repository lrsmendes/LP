package br.fatec.subprogramas;

import java.util.Scanner;

public class Positivismo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        
        while (n < 0){
            System.out.println("ERRO ");
            n = leia.nextInt();
        }
        
        if (maine(n)){
            System.out.println("Verdadeiro");   
        }
        
        else{
            System.out.println("Falso");
        }
        
    }
    
    private static boolean maine(int num) {        
        return num % 2 == 0;
    }
}

