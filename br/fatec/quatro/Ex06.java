package br.fatec.quatro;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        
        for (int i = 0; i < a.length; i++){
            a[i] = (int) leia.nextDouble();
        }
        
            System.out.println("");
        
        for (int i = 0; i < a.length; i++){
            b[i] = (int) Math.pow(a[i], 2);
        }
        
        for (int i = 0; i < a.length; i++){
            System.out.printf("%.0f ",b[i]);
        }
        
        System.out.println("");
    }
}
