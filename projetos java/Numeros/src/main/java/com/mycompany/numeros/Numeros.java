/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numeros;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Numeros {

    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite um número");
            n = teclado.nextInt();
            s = s + n;
            System.out.println("Quer continuar? [S/N] ");
            resp = teclado.next();
        } while(resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
    }
}
