package br.fatec.excecoes;

import java.io.*;

public class Ex1SlideExcecao {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Uso: java CopiaArquivoExcecao <arq1> <arq2>");
			return;
		}
		File arqEntrada = new File(args[0]);
		File arqSaida = new File(args[1]);
                try{
		FileReader leitor = new FileReader(arqEntrada);
		FileWriter escritor = new FileWriter(arqSaida);
		int c;
		while ((c = leitor.read()) != -1)
			escritor.write(c);
		leitor.close();
		escritor.close();                    
                }
                
                catch (Exception e){
                    
                }

	}
}



