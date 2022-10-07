/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class ExercicioRepita {

    public static void main(String[] args) {
        
        int n;
        int cont = 0;
        int p = 0;
        int i = 0;
        int s = 0;
        
        int x = 0;       /* soma tudo */
        
        int media; 
        
        do{   
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um número:  <br><em>(valor 0 interrompe)</html>"));
            cont = cont + 1;
            x = x + n;
            
            if (n%2==0){
                p = p + 1;
            } else {
                i= i + 1;
            }
             
            if (n>100){
                 s = s+1;
            }
            
            
            
        }while(n!=0);
        
        media = x/cont;
        
        
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <br>------------------" + 
                "<br>Total de Valores: " + cont
                + "<br> Total de Pares: " + p
                + "<br> Total de Ímpares: " + i
                + "<br> Acima de 100: " + s
                + "<br> Média: " + media
        

        );
    }  
}
