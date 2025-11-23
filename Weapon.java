/**
 * Клас "Зброя", спадкує загальні властивості Амуніції.
 */
public class Weapon extends Ammunition {
    private double damage; 

    public Weapon(String name, double weight, double price, double damage) {
        super(name, weight, price);
        this.damage = damage;
    }

    @Override
    public String toString() {
        return super.toString() + " | Шкода: " + damage;
    }
}