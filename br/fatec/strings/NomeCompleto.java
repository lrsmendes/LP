package br.fatec.strings;

import java.util.Scanner;

public class NomeCompleto {
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      String str = leia.nextLine();  
      
      String[] array = str.split(" ");
      
      if (array.length < 2){
          System.out.println("Você não informou um nome completo!");
      }
      
      else{
          System.out.print(array[array.length - 1] + ", " + array[0] + "\n");
      }
      
    }
}