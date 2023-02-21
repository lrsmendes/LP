package br.fatec.seis;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double precoAntigo, precoNovo;
        
        System.out.print("Escreva o preço antigo: ");
        precoAntigo = leia.nextDouble();
        
        System.out.print("Agora escreva o preço novo: ");
        precoNovo = leia.nextDouble();
        
        System.out.printf("O percentual de acrescimo é de %.1f%%\n ", acrescimoPrecos(precoAntigo, precoNovo));
    }
    
    private static double acrescimoPrecos(double valorAntigo, double valorNovo){
        double percentual = ((valorNovo - valorAntigo) / valorAntigo) * 100;
        return percentual;
    }
}
