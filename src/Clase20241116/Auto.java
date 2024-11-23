
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Auto extends Vehiculo {
    private String Carroceria;
    private String Transmision;


    public Auto(String MarcaVehiculos, String ColorVehiculo, String AñoFabricacion, 
                String PrecioVehiculo, String Carroceria, String Transmision) {
        super(MarcaVehiculos, ColorVehiculo, AñoFabricacion, PrecioVehiculo);
        this.Carroceria = Carroceria;
        this.Transmision = Transmision;
    }

    public String getCarroceria() {
        return Carroceria;
    }

    public void setCarroceria(String Carroceria) {
        this.Carroceria = Carroceria;
    }

    public String getTransmision() {
        return Transmision;
    }

    public void setTransmision(String Transmision) {
        this.Transmision = Transmision;
    }

    // Método para mostrar la información del Auto
    public void resAuto() {
        System.out.println("Carroceria: " + getCarroceria());
        System.out.println("Transmision: " + getTransmision());
        System.out.println("Marca: " + getMarcaVehiculos());
        System.out.println("Precio de Vehiculo: " + getPrecioVehiculo());
        System.out.println("Color: " + getColorVehiculo());
        System.out.println("-------------------");
    }
}

