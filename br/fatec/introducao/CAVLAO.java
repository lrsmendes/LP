/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.introducao;
import java.util.Scanner;
public class CAVLAO {
    public static void main(String[] args) {
        
        int quantidade = 0, golDoSantos = 0, golDoAdversario = 0, periodoInvicto = 0, golsMarcados = 0, golsSofridos = 0;
        int maiInvicto = 0;
        double vitoriasUm = 0, derrotasUm = 0;
        double percentualVitorias = 0, percentualDerrotas = 0;
                
                
                
        Scanner sc = new Scanner(System.in);
        
        quantidade = sc.nextInt();
        
        for(int i = 0; i<quantidade; i++){
            golDoSantos = sc.nextInt();
            golsMarcados += golDoSantos;
            golDoAdversario = sc.nextInt();
            golsSofridos += golDoAdversario;

            if (golDoSantos > golDoAdversario){
                vitoriasUm += 1;
            }
            if (golDoSantos < golDoAdversario){
                derrotasUm += 1;
            }
            if(golDoSantos >= golDoAdversario){
                periodoInvicto += 1;
            }
            if(periodoInvicto > maiInvicto){
                maiInvicto = periodoInvicto;
            }
            if(golDoSantos < golDoAdversario){
                periodoInvicto = 0;
            }
            percentualVitorias = (vitoriasUm / quantidade) * 100;
            percentualDerrotas = (derrotasUm / quantidade) * 100;
        }
        System.out.println("Percentual de vitórias: " + percentualVitorias + "%");
        System.out.println("Percentual de derrotas: " + percentualDerrotas + "%");
        System.out.println("Maior período invicto: " + maiInvicto);
        System.out.println("Número de gols marcados: " + golsMarcados);
        System.out.println("Número de gols sofridos: " + golsSofridos);
        
        
    }
    
}
