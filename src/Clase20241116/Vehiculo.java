
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Vehiculo {
    private String MarcaVehiculo;
    private String ColorVehiculo;
    private String PrecioVehiculo;

    public Vehiculo(String MarcaVehiculo, String ColorVehiculo, String PrecioVehiculo) {
        this.MarcaVehiculo = MarcaVehiculo;
        this.ColorVehiculo = ColorVehiculo;
        this.PrecioVehiculo = PrecioVehiculo;
    }

    public String getMarcaVehiculo() {
        return MarcaVehiculo;
    }

    public void setMarcaVehiculo(String MarcaVehiculo) {
        this.MarcaVehiculo = MarcaVehiculo;
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
