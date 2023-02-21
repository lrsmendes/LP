package br.fatec.seis;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Escreva o valor do vetor: ");
        int n = leia.nextInt();
        int vetor[] = new int [n];
        
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = leia.nextInt();
        }
        
        int[] res = maioreMenor(vetor);
        System.out.println("Menor elemento: " + res[0]);
        System.out.println("Maior elemento: " + res[1]);
    }
    
    public static int[] maioreMenor(int[] vet){
        int[] resultado = new int[2];
        resultado[0] = resultado[1] = vet[0];
        
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] < resultado[0]) {
                resultado[0] = vet[i];
            }
            else if (vet[i] > resultado[1]) {
                resultado[1] = vet[i];
            }
        }
        return resultado;
    }
}

/*
Escreva um programa em Java contendo um método que receba como parâmetro um vetor com n valores inteiros 
quaisquer. Determine e retorne outro vetor com dois elementos, sendo que na primeira posição há o  
menor número inteiro do vetor passado como parâmetro e na segunda posição, o maior número inteiro.
*/