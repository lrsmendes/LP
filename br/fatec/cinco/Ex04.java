package br.fatec.cinco;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        int cont = 0;
        
        leia.nextLine();
        
        String str, procurada;
        
        procurada = leia.nextLine();
        
        for (int i = 1; i <= n; i++){
            str = leia.nextLine();
            
            if (str.indexOf(procurada) != -1) {
                cont++;
            }
        }
        
        System.out.println("Número de ocorrencias " + procurada + ": " + cont);
    }
}
