
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Motocicleta extends Vehiculo{
        private String Cilindraje;
        private String TipoMotor;

    public Motocicleta(String Cilindraje, String TipoMotor, String MarcaVehiculo, String ColorVehiculo, String PrecioVehiculo) {
        super(MarcaVehiculo, ColorVehiculo, PrecioVehiculo);
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

    
        public void resMoto() {
        System.out.println("Marca: " + getMarcaVehiculo());
        System.out.println("Color: " + getColorVehiculo());
        System.out.println("Precio de Vehiculo: " + getPrecioVehiculo());
        System.out.println("Cilindraje: " + getCilindraje());
        System.out.println("Tipo de motor: " + getTipoMotor());
        System.out.println("-------------------");
    }
}
