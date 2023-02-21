package br.fatec.excecoes;

public class TesteErro {
	public static void main(String[] args) {
		System.out.println("início do main");
		metodo1();
		System.out.println("fim do main");
	}
	
	static void metodo1() {
		System.out.println("início do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	
	static void metodo2() {
		System.out.println("início do metodo2");
		int[] array = new int[10];
                try {
		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
                
                } catch (ArrayIndexOutOfBoundsException e){
                    System.err.println("Erro! Grande pra caraleo!!! Nem ia compilar seu FDP!!!");
                }
		System.out.println("fim do metodo2");
	}
}

