package boletin_17;

/**
 *
 * @author cfigueirasvalverde
 */
public class Morcego extends Mamifero implements IPodeVoar {
    @Override
    public void voar(){
        System.out.println("Vuelo para atrás");
    }
}