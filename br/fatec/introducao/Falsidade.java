/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.introducao;

/**
 *
 * @author Fatec
 */
public class Falsidade {
    
    public static void main(String[] args) {
        boolean a, b, c;
        
        a = false;
        b = true;
        
        c = (!a && b) || (a && !b); //alternativa c
        
        System.out.println(c);
    }
    
}
