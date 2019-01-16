package boletin_17;

/**
 *
 * @author cfigueirasvalverde
 */
public class Papagaio extends Ave implements IPodeVoar {
    @Override
    public void voar(){
        System.out.println("Vuelo con dos alas");
    }
}