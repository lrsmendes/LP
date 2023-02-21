package br.fatec.vetores;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int pares[] = new int[leia.nextInt()];
        
        for (int i = 0; i < pares.length; i++){
            pares[i] = leia.nextInt();
        }
        
        for (int i = 0; i < pares.length; i++){
            if (pares[i] % 2 == 0){
                System.out.println(pares[i]);
            }
        }
    }
}