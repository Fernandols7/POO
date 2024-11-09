
package POO;

/**
 *
 * @author Fernando Lopez
 */
public class Queco extends Animal{

    public Queco(String Pelo, String Boca, String Cola, String ojo, Integer Patas) {
        super(Pelo, Boca, Cola, ojo, Patas);
    }
    
    
    @Override
    public void Sonido(){
        System.out.println("No se pero hacen un ruido");
    }
}
