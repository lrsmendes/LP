//Autor: Lucas Raziel Silva Mendes

/* Escreva uma programa em Java que use um método que recebe um valor inteiro positivo como parâmetro... 
 * ...e devolve verdadeiro se o número for par, ou falso se o número for ímpar.
 */

package br.fatec.subprogramas;

import java.util.Scanner;

public class Ex1Slide3 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int num = leia.nextInt();
    boolean resultado = ParouImpar(num);
    
        System.out.println(resultado);
    }
    
    private static boolean ParouImpar(int num) {
        boolean res;
        if (num % 2 == 0){
            res = true;
        }
        
        else {
            res = false;
        }
        return res;
    }
 
}