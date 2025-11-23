/**
 * Клас "Лати/Броня", спадкує загальні властивості Амуніції.
 */
public class Armor extends Ammunition {
    private int defenseLevel; 

    public Armor(String name, double weight, double price, int defenseLevel) {
        super(name, weight, price);
        this.defenseLevel = defenseLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " | Захист: " + defenseLevel;
    }
}