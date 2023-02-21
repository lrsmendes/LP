package br.fatec.subprogramas;

import java.util.Scanner;

public class SomaInteiros {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in); 
       int n1 = leia.nextInt();
       int n2 = leia.nextInt();
       
       while (n1 < 0 || n2 < 0){
            System.out.println("ERRO ");
            n1 = leia.nextInt();
            n2 = leia.nextInt();
        }
       
       int resposta = somarNumeros(n1, n2);
       
        System.out.printf("A soma dos numeros entre %d e %d é de: %d\n",n1, n2, resposta);
    }
    
    private static int somarNumeros (int num1, int num2) {
        int soma = 0;
        for (int i = num1 + 1; i <= num2 - 1; i++){
            soma = soma + i;
        }
        return soma;
    }
}

