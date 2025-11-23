/**
 * Абстрактний клас "Амуніція", який описує загальні властивості спорядження.
 * Всі елементи амуніції наслідуються від цього класу.
 */
public abstract class Ammunition {
    private String name;
    private double weight; 
    private double price;  

    public Ammunition(String name, double weight, double price) {
        if (weight <= 0 || price < 0) {
            throw new IllegalArgumentException("Вага та ціна повинні бути позитивними числами!");
        }
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%-20s | Вага: %6.2f кг | Ціна: %7.2f золотих", name, weight, price);
    }
}