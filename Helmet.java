/**
 * Клас "Шолом", спадкує загальні властивості Амуніції.
 */
public class Helmet extends Ammunition {
    private String type; 

    public Helmet(String name, double weight, double price, String type) {
        super(name, weight, price); 
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тип шолома: " + type;
    }
}