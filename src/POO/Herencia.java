
package POO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando Lopez
 */
public class Herencia {

   
    public static void main(String[] args) {
        Animal p = new Perro("Negro", "SI", "SI", "SI", 4); p.Sonido();
        Animal g = new Gato("Blanco", "SI", "SI", "SI", 4); g.Sonido();
    }
    
    List<Animal> lista = new ArrayList<>();
        lista.add(p);
        lista.add(g);
        lista.add(new Queco("NO", "SI", "SI", "SI", 4));
    
    for (Animal item : lista){
        item.Sonido();
    }
    
}
