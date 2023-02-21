package br.fatec.quatro;

import java.util.Scanner;
 
public class Ex10 {
 
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int X[] = new int[10];
        
        for (int i = 0; i < X.length; i++){
            X[i] = leia.nextInt();
            
            if (X[i] <= 0){
                X[i] = 1;
            }
        }
        
        for (int i = 0; i < X.length; i++){
            System.out.printf("X[%d] = %d\n", i, X[i]);
        }
        
        leia.close();
 
    }
 
}