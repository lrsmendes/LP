package br.fatec.quatro;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n[] = new int[leia.nextInt()];
        int tamMaior = 1, indexMaior = 0, tamAtual = 1, indexAtual = 0;
        
        for (int i = 0; i < n.length; i++){
            n[i] = leia.nextInt(); //teste com 5 7 -1 0 3 6 6 4
        }
        
        for (int i = 1; i < n.length; i++){
            if (n[i] > n[i - 1]){
                tamAtual++;
                
                if (tamAtual > tamMaior){
                    tamMaior = tamAtual;
                    indexMaior = indexAtual;
                }
            }
            else {
                indexAtual = i;
                tamAtual = 1;
            }
        }
        
        System.out.print("Maior sequência crescente: ");
        for (int i = indexMaior; i < indexMaior + tamMaior; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println("");
    }
}