
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Parlante extends Producto{
        private String Sonido;
        private String Rendimiento;

    public Parlante(String Sonido, String Rendimiento, String Color, String Marca, String Modelo) {
        super(Color, Marca, Modelo);
        this.Sonido = Sonido;
        this.Rendimiento = Rendimiento;
    }

    public String getSonido() {
        return Sonido;
    }

    public void setSonido(String Sonido) {
        this.Sonido = Sonido;
    }

    public String getRendimiento() {
        return Rendimiento;
    }

    public void setRendimiento(String Rendimiento) {
        this.Rendimiento = Rendimiento;
    }
        
    
        public void resultados() {
        System.out.println("Sonido: " + Sonido);
        System.out.println("Rendimiento: " + Rendimiento);
        System.out.println("Color: " + getColor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("-------------------");
    }
    
}
