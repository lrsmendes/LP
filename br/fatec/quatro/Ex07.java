package br.fatec.quatro;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] media = new double[12];
        double maiorTemp = 0, menorTemp = 900, maiorMes = 0, menorMes = 0;
        
        for (int i = 0; i < media.length; i++){
            System.out.printf("%dº mês: ", i+1);
            media[i] = leia.nextDouble();
        }
        System.out.print("\n");
        for (int i = 0; i < media.length; i++){
            System.out.printf("%dº mês: %1.1fºC\n", i+1, media[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < media.length; i++){
            if (media[i] > maiorTemp){
                maiorTemp = media[i];
                maiorMes = i+1;
            }
            
            if (media[i] < menorTemp){
                menorTemp = media[i];
                menorMes = i+1;
            }
        }
        System.out.printf("Maior temperatura do ano: %1.1fºC foi registrada no mês %.0f\n", maiorTemp, maiorMes);
        System.out.printf("Menor temperatura do ano: %1.1fºC foi registrada no mês %.0f\n", menorTemp, menorMes);        
    }
}