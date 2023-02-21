package br.fatec.quatro;

import java.util.Random;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int n;
		
		System.out.print("Informe a ordem da matriz: ");
		n = in.nextInt();
		int[][] mat = new int[n][n];
		System.out.printf("Matriz %d x %d gerada:\n", n, n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = rand.nextInt(n * n);
				System.out.printf("%d\t", mat[i][j]);
			}
			System.out.println();
		}
		System.out.print("\nDiagonal principal da matriz: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", mat[i][i]);
		}
		System.out.println("\n\nMatriz sem a diagonal principal:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					System.out.print(mat[i][j]);
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.print("\nDiagonal secundaria da matriz: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", mat[i][n - 1 - i]);
		}
		System.out.println();
		in.close();
	}

}
