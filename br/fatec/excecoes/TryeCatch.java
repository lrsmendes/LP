package br.fatec.excecoes;

public class TryeCatch {
    public static void main(String[] args) {
    int a, d = 0;
    
    try {
        a = 42 / d;
        System.out.println("Isto não será exibido");
        System.out.println("Só se estivesse no 'finally'");
	} 
    
    catch (ArithmeticException e) {
	System.out.println("Divisão por zero");
	}
    
	System.out.println("Após o catch");
    }
}





