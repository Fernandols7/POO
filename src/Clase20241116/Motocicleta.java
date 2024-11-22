
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Motocicleta extends Vehiculo{
        private String Cilindraje;
        private String TipoMotor;

    public Motocicleta(String Cilindraje, String TipoMotor, String MarcaVehiculos, String ColorVehiculo, String AñoFabricacion, String PrecioVehiculo) {
        super(MarcaVehiculos, ColorVehiculo, AñoFabricacion, PrecioVehiculo);
        this.Cilindraje = Cilindraje;
        this.TipoMotor = TipoMotor;
    }

    public String getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(String Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public String getTipoMotor() {
        return TipoMotor;
    }

    public void setTipoMotor(String TipoMotor) {
        this.TipoMotor = TipoMotor;
    }
        
        

}
