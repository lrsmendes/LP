package br.fatec.excecoes;

import java.util.Scanner;

public class Ex2SlideExcecao {
	public static void main(String[] args) {
		int[] counts = new int[26];
		Scanner in = new Scanner(System.in);
		// recebe a palavra do usu�rio
		System.out.print("Informe uma unica palavra (apenas letras, por favor): ");
		String word = in.nextLine();
		// converte para mai�sculo
		word = word.toUpperCase();
		// conta a frequ�ncia de cada letra na palavra
		for (int i = 0; i < word.length(); i++) {
                    try {
			counts[word.charAt(i) - 'A']++;
                    }
                    catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Não é uma letra. '(" + word.charAt(i) + ")'");
            }
		}
		// imprime as frequ�ncias
		System.out.println();
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				System.out.println((char) (i + 'A') + ": " + counts[i]);
			}
		}
	}
}