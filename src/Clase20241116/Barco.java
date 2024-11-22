
package Clase20241116;

/**
 *
 * @author Fernando Lopez
 */
public class Barco extends Vehiculo{
        private String TipoEmbarcacion;
        private String Longitud;

    public Barco(String TipoEmbarcacion, String Longitud, String MarcaVehiculos, String ColorVehiculo, String AñoFabricacion, String PrecioVehiculo) {
        super(MarcaVehiculos, ColorVehiculo, AñoFabricacion, PrecioVehiculo);
        this.TipoEmbarcacion = TipoEmbarcacion;
        this.Longitud = Longitud;
    }

    public String getTipoEmbarcacion() {
        return TipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String TipoEmbarcacion) {
        this.TipoEmbarcacion = TipoEmbarcacion;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String Longitud) {
        this.Longitud = Longitud;
    }
        
        

}
