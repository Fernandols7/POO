
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Cajero extends CuentaBancaria{
    private double Depositar;
    private double Retirar;

    public Cajero(double Depositar, double Retirar, double Saldo) {
        super(Saldo);
        this.Depositar = Depositar;
        this.Retirar = Retirar;
    }

    public double getDepositar() {
        return Depositar;
    }

    public void setDepositar(double Depositar) {
        this.Depositar = Depositar;
    }

    public double getRetirar() {
        return Retirar;
    }

    public void setRetirar(double Retirar) {
        this.Retirar = Retirar;
    }
    
    public void depositarDinero(){
        System.out.println("Su saldo es: ");
    }
    
    public void retitatDinero(){
        System.out.println("Su saldo es: ");
    }

}
