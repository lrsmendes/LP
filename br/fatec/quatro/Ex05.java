package br.fatec.quatro;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        System.out.print("Digite o número de mercadorias: ");
        double lucro = 0; int mercadorias = leia.nextInt();
        float compras[] = new float[mercadorias];
        float vendas[] = new float[mercadorias];
        double percentualLucro;
        int mercadoriaMenor10 = 0, mercadoriaMenor20 = 0, mercadoriaMaior20 = 0;
        
        for (int i = 0; i < compras.length; i++){
            System.out.printf("Digite o preço de compras da %dª mercadoria: ", i+1);
            compras[i] = leia.nextFloat();
            
            System.out.printf("Digite o preço de vendas da %dª mercadoria: ", i+1);
            vendas[i] = leia.nextFloat();
        }
        
        System.out.println("");
        
        for (int i = 0; i < compras.length; i++){
            lucro = vendas[i] - compras[i];
            percentualLucro = lucro / compras[i] * 100;
            
        if (percentualLucro < 10.0){
            mercadoriaMenor10 += 1;
        }
        
        else if (percentualLucro <= 20) {
            mercadoriaMenor20 += 1;
        }
        
        else {
            mercadoriaMaior20 += 1;
        }
          
            }

        System.out.println("");
        
        System.out.printf("Número de mercadorias com lucro inferior a 10%% é %d\n", mercadoriaMenor10);
        System.out.printf("Número de mercadorias com lucro maior ou igual a 10%% e menor do que 20%%: %d\n", mercadoriaMenor20);
        System.out.printf("Número de mercadorias com lucro superior a 20%%: %d\n", mercadoriaMaior20);
    }
}