package br.fatec.seis;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double nota1, nota2, nota3;
        char letran;
        
        nota1 = leia.nextDouble();
        nota2 = leia.nextDouble();
        nota3 = leia.nextDouble();
        
        leia.nextLine(); //pra limpar o leia, senão crasha a leitura de string
        
        System.out.print("Média (A)ritimética ou (P)onderada: ");
        letran = leia.nextLine().charAt(0);
        System.out.printf("Media: %.2f\n", calcularMedia(nota1, nota2, nota3, letran));       
    }
    
    private static double calcularMedia(double n1, double n2, double n3, char letra){
        double media = 0;
        if (Character.toUpperCase(letra) == 'A') { //letran é mandado aqui
            media = (n1 + n2 + n3) / 3;
        }
        
        else{
            media = (n1 * 5 + n2 * 3 + n3 * 2) / 10;
        }
        return media;
    }
}
