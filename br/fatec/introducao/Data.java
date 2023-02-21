/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Fatec
 */
public class Data {
    
    public static void main(String[] args) {
        
    Calendar diah = new GregorianCalendar();

    int intro = diah.get(Calendar.DAY_OF_MONTH);
        
        System.out.print("(c)Raziel, 2022 - " + diah.get(Calendar.YEAR) + "\n");
        
        int dia, mes, ano;
        String ext;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Escreva o dia: ");
        
        dia = leia.nextInt();
          
        System.out.print("Escreva o mês: ");
        
        mes = leia.nextInt();
         
        System.out.print("Escreva o ano: ");
              
        ano = leia.nextInt();
        
        System.out.println("");
        ext = "ZERO";
        
        switch (mes)
        {
            case 1:
                ext = "JANEIRO";
            break;
                
                case 2:
                    ext = "FEVEREIRO";
            break;
                    
                    case 3:
                        ext = "MARÇO";
            break;
                        
                        case 4:
                            ext = "ABRIL";
            break;
                            
                            case 5:
                                ext = "MAIO";
            break;
                                
                                case 6:
                                    ext = "JUNHO";
            break;
                                    
                                    case 7:
                                        ext = "JULHO";
            break;
                                        
                                        case 8:
                                            ext = "AGOSTO";
            break;
                                            
                                            case 9:
                                                ext = "SETEMBRO";
            break;
                                                
                                                case 10:
                                                    ext = "OUTUBRO";
            break;
                                                    
                                                    case 11:
                                                        ext = "NOVEMBRO";
            break;
                                                        
                                                        case 12:
                                                            ext = "DEZEMBRO";
            break;      
        }
                                                                    
        System.out.println("A sua data inserida é de " + dia + "/" + ext + "/" + ano);
    }
}
