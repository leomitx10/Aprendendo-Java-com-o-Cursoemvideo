/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.repeticaofor;

/**
 *
 * @author Leandro
 */
public class RepeticaoFor {

    public static void main(String[] args) {
        
        /*for (int cc =0; cc<=100;cc = cc + 10){
            System.out.println(cc);
        }*/
            
        for (int i = 1; i <= 3; i++){
            for(int j = 0; j <=2; j=j+2){
                System.out.println(i + "---" + j);
            }
        }
        
    }
}
