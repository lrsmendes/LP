package br.fatec.sete;

public class Ex5 {
    public static void main(String[] args) {
        int waitTime = 46;
        try {
            System.out.println( "Entrei no bloco try." ); 
            if (waitTime > 30) {
                throw new Exception( "Maior que 30." );
            }
            
            else if (waitTime < 30) {
                throw new Exception( "Menor que 30." );
            }
            
            else {
                System.out.println( "Nenhuma exceção." );
            }
            
            System.out.println( "Deixando o bloco try." ); } catch (Exception e) {
                System.out.println(e.getMessage());
        }
        System.out.println( "Após o bloco catch." );
    }
}
