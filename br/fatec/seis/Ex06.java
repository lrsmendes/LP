package br.fatec.seis;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Escreva o número de strings: ");
        int n = leia.nextInt();
        
        leia.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("%dª string: ", i + 1);
            strings[i] = leia.nextLine();
        }
        
        if (ordemAlfabetica(strings)){
            System.out.println("Suas strings estão em ordem alfabetica.");
        }
        
        else{
            System.out.println("é... não estão.");
        }
    }
    
    private static Boolean ordemAlfabetica(String letras[]){
        for (int i = 0; i < letras.length - 1; i++) {
            if (letras[i + 1].compareToIgnoreCase(letras[i]) > 0) {
                return true;
            }
        }
        return false;
    }
}
