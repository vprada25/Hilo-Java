/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilostaller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextArea;

/**
 *
 * @author Jeisson Lopez
 */
public class Fecha extends Thread {

    Date date = new Date();
    JTextArea fecha, hora;

    public Fecha(JTextArea fecha, JTextArea hora) {
        this.fecha = fecha;
        this.hora = hora;

    }

    public void run() {
        int x = 0;
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        String horah = hourFormat.format(date);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaf = dateFormat.format(date);
        System.out.println(""+horah+" "+fechaf);
        while (Thread.interrupted()) {
            try {

                fecha.setText("" + fechaf);
                hora.setText("" + horah);
                Thread.sleep(1000);
                x++;

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

            }

        }

    }

}
