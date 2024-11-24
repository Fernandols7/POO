
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Laptop extends Producto{
        private String Pantalla;
        private String Teclado;

    public Laptop(String Pantalla, String Teclado, String Color, String Marca, String Modelo) {
        super(Color, Marca, Modelo);
        this.Pantalla = Pantalla;
        this.Teclado = Teclado;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public String getTeclado() {
        return Teclado;
    }

    public void setTeclado(String Teclado) {
        this.Teclado = Teclado;
    }
    
    public void resultados() {
        System.out.println("Pantalla: " + Pantalla);
        System.out.println("Teclado: " + Teclado);
        System.out.println("Color: " + getColor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("-------------------");
    }    
        
}
