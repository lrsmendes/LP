package br.fatec.seis;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int n = leia.nextInt();
        int[] vet = new int[n];
        
        System.out.print("Informe os " + n + " elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            vet[i] = leia.nextInt();
        }
        
        trocaPosicao(vet);
        impressoraVetor(vet);
    }
    
    private static void trocaPosicao (int[] vetor){
        int cont;
        for (int i = 0; i < vetor.length / 2; i++) {
            cont = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = cont;
        }
        
    }
    
    private static void impressoraVetor(int[] vetor) {
        System.out.print("Conteudo do vetor: { ");
        int i;
        for (i = 0; i < vetor.length - 1; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.println(vetor[i] + " }");
    }
}