package boletin_17;

/**
 *
 * @author cfigueirasvalverde
 */
public class Felino extends Mamifero implements IPodeNadar {
    @Override
    public void nadar(){
        System.out.println("Nado para atrás");
    }
}