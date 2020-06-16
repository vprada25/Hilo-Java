/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilostaller;

/**
 *
 * @author Kevin Galindo
 */
public class HiloRunnable implements Runnable {
    
    final private String nombre;
    
    public HiloRunnable (String nombre){
        this.nombre = nombre;
    }
    

    @Override
    public void run() {
        for (int i = 1; i <=5; i++){
            System.out.println("Hilo  "+ nombre + "" + i);
            
        }
    }
    
}
