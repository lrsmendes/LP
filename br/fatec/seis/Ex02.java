package br.fatec.seis;

public class Ex02 {
    public static void main(String[] args) {
        repetirString("Fatec", 10);
    }
    
    public static void repetirString(String str, int repeticoes) { 
        for (int i = 1; i <= repeticoes; i++) {
            System.out.println(str);
        }
    }
}
