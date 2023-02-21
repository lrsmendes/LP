package br.fatec.introducao;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        
        double n;
        int i, j, mult, cont;
        Scanner leia = new Scanner(System.in);
        
        //leitura de variaveis...
        System.out.print("Escreva o N: ");
        n = leia.nextDouble(); //n. de multiplos a serem impressos...
        System.out.print("Escreva o I: "); 
        i = leia.nextInt(); //primeiro numero
        System.out.print("Escreva o J: "); //segundo numero
        j = leia.nextInt();
        System.out.println("");
        
        //incializações
        mult = 0;
        cont = 0;
        
        while (cont < n)
            
        {
            
      // verifica se mult é multiplo de i ou j 
            if (mult % i == 0 || mult % j == 0)
                    {
                        System.out.printf(" %d", mult);
                        cont = cont + 1;
                    }
            mult = mult + 1;

        }
        
        System.out.println("");

    }
    
}
