package br.fatec.excecoes;

public class ExercicioExcecao1 {
    public static void main(String[] args) {   
        try {
        int i = Integer.parseInt("BOABO");
        System.out.println(i);
        }
        
        catch (NumberFormatException e){
            
        }
        
        catch (ArrayIndexOutOfBoundsException e){
            
        }
    }
}
