/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetor05;

import java.util.Arrays;

/**
 *
 * @author Leandro
 */
public class Vetor05 {

    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v,2);
        for(int valor: v){
            System.out.print(valor + " ");
        }
    }
}
