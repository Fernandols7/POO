
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Auto extends Vehiculo{
        private String Carroceria;
        private String Transmision;

    public Auto(String Carroceria, String Transmision, String MarcaVehiculos, String ColorVehiculo, String AñoFabricacion, String PrecioVehiculo) {
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
        
    
    
}
