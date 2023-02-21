package br.fatec.introducao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int n, t, l, a = 0, b = 0, s, ponto;
        
        Scanner leia = new Scanner(System.in); 
        
        n = leia.nextInt();
        t = leia.nextInt();
        l = leia.nextInt();
        
        for (int i = 1; i < n; i++){
            s = leia.nextInt();
                if ((t - s) <= l){
                    t = s;
                    ponto = 1;
                    
                    if (i % 2 == 0){
                        a = a + ponto;
                    }
                    
                    if (i % 1 == 0){
                        b = b + ponto;
                    }
                }
        }
        System.out.println("");
        System.out.printf("%d %d", a, b);
        System.out.println("");
    }
    
}
