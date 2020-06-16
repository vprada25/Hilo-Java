/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConvThread;


public class MainHilo {

    
    public static void main(String[] args) {
       HiloRunnable hilo1 = new HiloRunnable("UNO");
       Thread t1 = new Thread(hilo1);
       
       HiloRunnable hilo2 = new HiloRunnable("DOS");
       Thread t2 = new Thread(hilo2);
       
       
       t1.start();
       t2.start();
    }
    }
    

