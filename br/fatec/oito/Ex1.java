package br.fatec.oito;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Erro: uso incorreto!");
            System.exit(1);
        }
        
        File fIn = new File(args[0]);
        if (fIn.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fIn));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))) {
                while (br.ready()) {
                    String s = br.readLine();
                    bw.write(s.toUpperCase());
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Erro de leitura/escrita!");
                e.printStackTrace();
            }
        } else {
            System.out.println("Erro: arquivo nao encontrado (" + args[0] + ")");
        }
    }
}
