/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resoluçãodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Leandro
 */
public class ResoluçãoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension D = tk.getScreenSize();
        System.out.println("A resolução da tela é:" + D.width + "X" + D.height);
    }
    
}
