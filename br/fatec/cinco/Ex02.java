package br.fatec.cinco;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String texto;
        int cont = 0;
        
        texto = leia.nextLine();
        
        for (int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z'){
                cont = cont + 1;
            }
        }
        
        System.out.println(cont);
    }
}