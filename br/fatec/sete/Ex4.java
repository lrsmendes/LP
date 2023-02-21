package br.fatec.sete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex4 {
    public static void main(String[] args) {
        
    }
    
    public static void cat(File file) {
        RandomAccessFile input = null;
         String line = null;
         
         try {
            input = new RandomAccessFile(file, "r");
              while ((line = input.readLine()) != null) {
                  System.out.println(line);
              }
              return;
              } catch(FileNotFoundException fnf) {
                  System.err.format("O arquivo %s não foi encontrado!\n", file);
                  } catch(IOException e) {
                      System.err.println(e.toString());
                      } finally {
             if (input != null) {
                 try {
                     input.close();
                     } catch(IOException io) { //1 milhão de gambiarras depois...
                         
                 }
             }
         }
    }
}
