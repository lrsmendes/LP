/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Fatec
 */
public class Nascimento {
    
    public static void main(String[] args) {    
        System.out.print("(c)Raziel, 2022\n\n");
        Scanner leia = new Scanner(System.in);
        
        Calendar diah = new GregorianCalendar();
        
        int dia = diah.get(Calendar.DAY_OF_MONTH);
        int mes = diah.get(Calendar.MONTH) + 1;
        int ano = diah.get(Calendar.YEAR);
        
        int diau, mesu, anou;
        
        System.out.printf("Hoje é: %d/%d/%d\n", dia, mes, ano);
        
        System.out.print("Escreva o dia de seu nascimento: ");
        
        diau = leia.nextInt();
          
        System.out.print("Escreva o mês de seu nascimento: ");
        
        mesu = leia.nextInt();
         
        System.out.print("Escreva o ano de seu nascimento: ");
              
        anou = leia.nextInt();
        
        System.out.println("");
     
        int idade = ano - anou;

        if (mesu > mes || (mesu == mes && diau > dia))
        {
            idade = idade - 1;
            
        }
        
            System.out.printf("Você nasceu em %d/%d/%d ", diau, mesu, anou);
            System.out.print("portanto você tem " + idade + " anos de idade.\n");
    
    }
    
}
