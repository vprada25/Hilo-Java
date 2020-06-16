/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilostaller;

import com.sun.webkit.ThemeClient;
import javax.swing.JTextArea;

/**
 *
 * @author Jeisson Lopez
 */
public class h2 extends Thread{
    String s;
    JTextArea Entrada;
    JTextArea Salida;
    int Selector;

    public h2(JTextArea Entrada, String s, JTextArea Salida,int Selector) {
        this.Entrada = Entrada;
        this.s = s;
        this.Salida = Salida;
        this.Selector=Selector;

    }

    public void run() {
        int Selector1=Selector * 1000;
        int x = Integer.parseInt(Entrada.getText());
        for (int i = x; i >= 0; i--) {
            try {
                 Salida.setText(s + "" + i);
                Thread.sleep(Selector1);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

            }
           

        }

    }
}
    

