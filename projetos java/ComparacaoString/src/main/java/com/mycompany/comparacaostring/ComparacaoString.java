/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.comparacaostring;

/**
 *
 * @author Leandro
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "leandro";
        String nome2 = "leandro";
        String nome3 = new String ("leandro");
        
        String res = (nome1.equals(nome3))? "igual":"diferente";
        
        System.out.println(res);
    }
}
