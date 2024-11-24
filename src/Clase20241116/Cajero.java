
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Cajero {
    
private double saldo;


    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Nuevo saldo: " + saldo);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Nuevo saldo: " + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Error: Fondos insuficientes.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
    
}
