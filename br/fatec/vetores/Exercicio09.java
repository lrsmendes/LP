package br.fatec.vetores;

import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe o número de elementos da sequência: ");
        
        int n = leia.nextInt();
        int[] seq = new int[n];
        int indexInicioMaior = 0, tamMaior = 1, indexInicioAtual = 0,
                tamAtual = 1;
        
        System.out.print("Informe os " + n + " elementos da sequência: ");
        
        for (int i = 0; i < n; i++){
            seq[i] = leia.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++){
            if (seq[i + 1] > seq[i]){
               tamAtual = tamAtual + 1; 
               
               if (tamAtual > tamMaior){
                   indexInicioMaior = indexInicioAtual;
                   tamMaior = tamAtual;
               }
            }
            
            else {
                indexInicioAtual = i + 1;
                tamAtual = 1;
            }
        }
        System.out.print("\nMaior sequência crescente: ");
        
        for (int i = indexInicioMaior; i < indexInicioMaior + tamMaior; i++){
            System.out.print(seq[i] + " ");
        }
        System.out.println("");
    }
    
}
