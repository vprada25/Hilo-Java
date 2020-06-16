
package HiloRetiroCajero;


public class VerificarCuenta {
    
    private CuentaBanco cb = new CuentaBanco ();
    
    private void HacerRetiro (int cantidad) throws InterruptedException{
        if (cb.getSaldo()>= cantidad){
            System.out.println(Thread.currentThread().getName() + ": Esta realizando el retiro");
            Thread.sleep(2000);
        cb.RetiroBancario(cantidad);
            System.out.println(Thread.currentThread().getName() + ": Retiro realizado");
        
        }
    }
    
}
