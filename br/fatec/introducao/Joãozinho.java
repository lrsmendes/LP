/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.introducao;

import java.util.Scanner;

/**
 *
 * @author Himeko
 */
public class Joãozinho {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int golsdoSantos = 0, golsdoAdversario = 0, golsMarcados = 0, golsSofridos  = 0;
        int jogosInvictos = 0, maiInvicto = 0;
        int i = 0;
        double numeroDeVitorias = 0, numeroDeDerrotas = 0;
        int quantidadeDePartidas = leia.nextInt();
        
        do{
            
           golsdoSantos = golsdoSantos + leia.nextInt();
           golsdoAdversario = golsdoAdversario + leia.nextInt();
           i = i + 1;
           
           if (golsdoSantos > golsdoAdversario){
               golsMarcados = golsMarcados + 1;
           }
           else {
               golsSofridos = golsSofridos + 1;
           }
           
           if (golsdoSantos > golsdoAdversario){
               numeroDeVitorias = numeroDeVitorias + 1; 
           }
           
           else if (golsdoSantos < golsdoAdversario) {
               numeroDeDerrotas = numeroDeDerrotas + 1;
           }
           
            if (golsdoSantos >= golsdoAdversario){
               jogosInvictos = jogosInvictos + 1;
               
            if (jogosInvictos > maiInvicto){
               maiInvicto = maiInvicto + 1;
                }
           }
            
           else if (golsdoSantos < golsdoAdversario) {
               jogosInvictos = 0;
           }
           
           golsdoSantos = 0;
           golsdoAdversario = 0;
        }
        
        while (i < quantidadeDePartidas);
        
        
        System.out.println("\nPercentual de vítorias: " + (numeroDeVitorias / quantidadeDePartidas) * 100 + "%");
        System.out.println("Percentual de derrotas: " + (numeroDeDerrotas / quantidadeDePartidas) * 100 + "%");
        System.out.println("Maior periodo invicto: " + maiInvicto);
        System.out.println("Numero de gols marcados: " + golsMarcados);
        System.out.println("Numero de gols sofridos: " + golsSofridos);
    }   
    
}
