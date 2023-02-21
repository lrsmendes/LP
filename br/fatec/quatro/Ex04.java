package br.fatec.quatro;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);    
        int vet[] = new int[leia.nextInt()]; //tamanho do vetor
        
        for (int i = 0; i < vet.length; i++){
            vet[i] = leia.nextInt(); //entrada
        }
        
        System.out.println("");
        
        for (int i = 0; i < vet.length; i++){ //só vai imprimir positivo
            if (vet[i] >= 0){
                System.out.println(vet[i]);
            }
        }
    }
}