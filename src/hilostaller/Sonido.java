/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilostaller;

import javax.swing.JTextArea;
import java.applet.AudioClip;

/**
 *
 * @author Jeisson Lopez
 */
public class Sonido extends Thread {

    String s;
    JTextArea uno;
    JTextArea dos;
    int Selector;
    AudioClip Sonido1;

    public Sonido(JTextArea uno, String s, JTextArea dos, int Selector) {
        this.uno = uno;
        this.s = s;
        this.dos = dos;
        this.Selector = Selector;

        Sonido1 = java.applet.Applet.newAudioClip(getClass().getResource("/hilostaller/soni2.wav"));

    }

    public void run() {
        int Selector1 = Selector * 1000;

       
        int x = 0;
        int y = Integer.parseInt(dos.getText());

        while (!(x == y)) {
            try {
                Thread.sleep(Selector1-90);
                x++;
                y--;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        } Sonido1.play();

//        for (int i = x; !(i == y); i++,y--) {
//            try {
//                Thread.sleep(Selector1);
//                System.out.println("Estoy dormiendo");
//
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//
//            }
//        }
//        System.out.println("Lo encontre");
//        Sonido1.play();
    }

}
