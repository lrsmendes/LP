package br.fatec.cinco;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        leia.nextLine();
        char ch = leia.nextLine().charAt(0);
        String[] array = new String[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = leia.nextLine();
            
            if (array[i].charAt(0) != ch && array[i].charAt(0) != (ch - 32)) {
                System.out.println("Você não informou uma string que comeca com " + ch);
                i = i - 1;
            }
        }
        
        System.out.println("\n" + n + " strings que começam com " + ch + ":");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
