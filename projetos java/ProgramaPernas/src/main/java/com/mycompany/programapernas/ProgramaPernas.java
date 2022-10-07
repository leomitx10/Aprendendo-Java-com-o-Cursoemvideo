/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programapernas;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = tec.nextInt();
        System.out.println("Isso é um(a) ");
        String tipo;
        switch (perna){
            case 1:
                tipo= "Saci";
                break;
            case 2:
                tipo="Bípede";
                break;
            case 3:
                tipo="Tripé";
                break;
            case 4:
                tipo="Quadrúpede";
                break;
            case 6:
                tipo="Aranha";
                break;
            default:
                tipo="ET";
                break;
        }
        
        System.out.println(tipo);
        
        
        
    }
}
