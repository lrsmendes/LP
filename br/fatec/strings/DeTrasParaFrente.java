package br.fatec.strings;

import java.util.Scanner;

public class DeTrasParaFrente {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
            String input = leia.nextLine();
            
            StringBuffer stringReverso = new StringBuffer(input);
            
            stringReverso.reverse();
            
            System.out.println(stringReverso.toString());
    }
}