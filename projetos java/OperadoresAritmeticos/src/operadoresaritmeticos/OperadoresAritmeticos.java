/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Leandro
 */
public class OperadoresAritmeticos {
    private static Object math;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 =5;
        float m = (n1+n2)/2;
        System.out.println(m);*/
        
        /*int x = -9;
        x *= 2;
        System.out.println(x);*/
       /* int a = (int) Math.pow(x,3);
        float b = (float) Math.sqrt(81);
        float c = (float) Math.cbrt(27);
        System.out.println("Potencia" +" " + a);
        System.out.println("raiz quadrada" +" " + b);
        System.out.println("raiz cúbica" +" " + c);*/
        
        float a = -9.35f;
        float j = (float) Math.abs(a);
        System.out.println(j);
        
        float b = (float) Math.floor(a);
        System.out.println(b);
        
        float c = (float) Math.ceil(a);
        System.out.println(c);
        
        float d = (float) Math.round(a);
        System.out.println(d);
        
        float ale = (float) Math.random();
        int n = (int) (1+ ale*(100-1));
        System.out.println(n);
        
        
    }
    
}
