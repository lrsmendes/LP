package br.fatec.introducao;

import java.util.Scanner;

public class Ex22 {
    //DON'T STOP THE ROCK! (c)Raziel, '22
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
 System.out.print("Digite a quantidade de termos: ");
 
    int n = leia.nextInt(); //dado n...
    int f1 = 1; //f1
    int f2 = 1; //f2
    
    System.out.print("1 "); //obrigatoriamente o fibonacci tem que ter 1 e 1...
    System.out.print("1 "); //... então se escreve na sequencia.
    n = n - 2; //tira 2 do n de acordo com a formula (Fi-1 + Fi-2) no meu caso o i é n
    
    while (n > 0) {
        
        System.out.print((f1+f2) + " "); 
        
        int f3 = f1+f2;
        f1 = f2;
        f2 = f3;
        
        n--;
    }
        System.out.println("");
    }
    
    
}
