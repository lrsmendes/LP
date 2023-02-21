package br.fatec.cinco;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String vogais = "aeiou";
        String frase = leia.nextLine().toLowerCase();
        int ast[] = new int[5];
        
        for (int i = 0; i < vogais.length(); i++){
            for (int j = 0; j < frase.length(); j++){
                if (Character.toLowerCase(frase.charAt(j)) == vogais.charAt(i)){
                   ast[i] = ast[i] + 1; 
                }
            }
        }
        
        for (int i = 0; i < vogais.length(); i++){
            System.out.print(vogais.charAt(i) + ": ");
            
            for (int j = 1; j <= ast[i]; j++) {
                System.out.print('*');
            }
            
            System.out.println(" (" + ast[i] + ")");
        }
        
    }
}
