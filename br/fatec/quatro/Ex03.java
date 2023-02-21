package br.fatec.quatro;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int vet[] = new int [10];
        Scanner leia = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++){
           vet[i] = leia.nextInt();
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < 10; i++){
            System.out.print(vet[i]);
                if (vet[i] % 2 == 0){
                        System.out.print(" PAR");
                    }
                    else {
                        System.out.print(" IMPAR");
                    }
                System.out.println();
        }
        
    }
    
}