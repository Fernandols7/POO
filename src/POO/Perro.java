
package POO;

/**
 * @author Fernando Lopez
 */
public class Perro extends Animal{

    public Perro(String Pelo, String Boca, String Cola, String ojo, Integer Patas) {
        super(Pelo, Boca, Cola, ojo, Patas);
    }
    
    
    @Override
    public void Sonido(){
        System.out.println("El Perro ladra");
    }
    
    }
