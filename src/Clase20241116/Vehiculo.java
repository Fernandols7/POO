
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Vehiculo {
    private String MarcaVehiculos;
    private String ColorVehiculo;
    private String PrecioVehiculo;

    public Vehiculo(String MarcaVehiculos, String ColorVehiculo, String AñoFabricacion, String PrecioVehiculo) {
        this.MarcaVehiculos = MarcaVehiculos;
        this.ColorVehiculo = ColorVehiculo;
        this.PrecioVehiculo = PrecioVehiculo;
    }

    public String getMarcaVehiculos() {
        return MarcaVehiculos;
    }

    public void setMarcaVehiculos(String MarcaVehiculos) {
        this.MarcaVehiculos = MarcaVehiculos;
    }

    public String getColorVehiculo() {
        return ColorVehiculo;
    }

    public void setColorVehiculo(String ColorVehiculo) {
        this.ColorVehiculo = ColorVehiculo;
    }


    public String getPrecioVehiculo() {
        return PrecioVehiculo;
    }

    public void setPrecioVehiculo(String PrecioVehiculo) {
        this.PrecioVehiculo = PrecioVehiculo;
    }
    
    

}
