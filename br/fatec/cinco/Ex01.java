package br.fatec.cinco;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "arte de tudo ";
        String str2 = "Eu li p";
        String str3 = "ao longo da viagem";
        
        str1 = str1.concat(str3);
        str2 = str2.concat(str1);
        System.out.println(str2);
    }
}
