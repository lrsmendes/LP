//Autor: Lucas Raziel Silva Mendes

/* Escreva um programa em Java contendo um método que recebe dois números positivos como parâmetros... 
 * ...e retorne a soma dos números inteiros existentes entre eles (inclusive).
 */

package br.fatec.subprogramas;

import java.util.Scanner;

public class Ex2Slide3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("N1: ");   
        int n1 = leia.nextInt();
        
        System.out.print("N2: ");
        int n2 = leia.nextInt();
        
        System.out.printf("\nSoma dos valores entre %d e %d = %d\n", n1, n2, somarIntervalo(n1, n2));
    }
    
    private static int somarIntervalo (int num1, int num2) {
        if (num1 > num2){
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        
        int soma = 0;
        for (int i = num1; i <= num2; i++){
            soma = soma + i;
        }
        
        return soma;
    }
}
