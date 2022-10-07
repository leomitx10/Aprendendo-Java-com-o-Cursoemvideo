/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programaidade;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        System.out.println("Em que ano você nasceu? ");
        Scanner teclado = new Scanner(System.in);
        int nasc = teclado.nextInt();
        int i = 2022 - nasc;
        System.out.println("Sua idade é: " + i);
        if (i>=18){
            System.out.println("Maior de idade");
        } else {System.out.println("Menor de idade");}
 
    }
}
