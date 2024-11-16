
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Producto {
    private String Color;
    private String Marca;
    private String Modelo;

    public Producto(String Color, String Marca, String Modelo) {
        this.Color = Color;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    
}
