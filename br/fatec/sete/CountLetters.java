package br.fatec.sete;

import java.util.Scanner;

public class CountLetters {
	public static void main(String[] args) {
		int[] counts = new int[26];
		Scanner leia = new Scanner(System.in);
		// recebe a palavra do usuário
		System.out.print("Informe uma unica palavra (apenas letras, por favor): ");
		String frase = leia.nextLine();
		// converte para maiúsculo
		frase = frase.toUpperCase();
		// conta a frequência de cada letra na palavra
		for (int i = 0; i < frase.length(); i++) {		
			try {
                            counts[frase.charAt(i) - 'A']++;
			} catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Nao é uma letra ('" + frase.charAt(i) + "')");
			}
		}
		// imprime as frequências
		System.out.println();
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				System.out.println((char) (i + 'A') + ": " + counts[i]);
			}
		}
	}
}

