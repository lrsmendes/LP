package br.fatec.vetores;

import java.util.Scanner;

public class Inverso {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe o numero de elementos do vetor: ");
        int tam = leia.nextInt();
        int[] vet = new int[tam];
        
        System.out.print("Informe os " + tam + " elementos do vetor: ");
        for (int i = 0; i < tam; i++) {
            vet[i] = leia.nextInt();
        }
        
        System.out.print("\nVetor em ordem inversa: ");
        for (int i = tam - 1; i >= 0; i--) {
            System.out.print(vet[i] + " ");
        }
    }
}