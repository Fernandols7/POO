
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Televisor extends Producto{
        private String Pantalla;
        private String Sonido;

    public Televisor(String Pantalla, String Sonido, String Color, String Marca, String Modelo) {
        super(Color, Marca, Modelo);
        this.Pantalla = Pantalla;
        this.Sonido = Sonido;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public String getSonido() {
        return Sonido;
    }

    public void setSonido(String Sonido) {
        this.Sonido = Sonido;
    }

    public void resultados() {
        System.out.println("Pantalla: " + Pantalla);
        System.out.println("Sonido: " + Sonido);
        System.out.println("Color: " + getColor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("-------------------");
    }

}
