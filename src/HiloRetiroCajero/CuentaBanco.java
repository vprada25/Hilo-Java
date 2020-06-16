/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiloRetiroCajero;

public class CuentaBanco {
    private int saldo = 50;
    
    public CuentaBanco(){
        
    }
    public int getSaldo (){
        return saldo;
    }
    
    public void RetiroBancario(int retiro){
        saldo = saldo - retiro;
    }
}
