package br.fatec.strings;

import java.util.Scanner;

public class Alfabetica {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String str1 = leia.nextLine();
        String str2 = leia.nextLine();
        
        int comparacao = str1.compareToIgnoreCase(str2);
        
        System.out.println();
            
            if (comparacao < 0){
                System.out.println(str1);
                System.out.println(str2);
                
            }
            else {
                System.out.println(str2);
                System.out.println(str1);
            }
        }
    }