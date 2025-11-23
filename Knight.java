import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Клас "Лицар", який містить список амуніції та методи для роботи з ним.
 */
public class Knight {
    private List<Ammunition> equipment;

    public Knight() {
        equipment = new ArrayList<>();
    }

    /**
     * Метод для екіпірування лицаря (додавання предмету).
     */
    public void equip(Ammunition item) {
        equipment.add(item);
    }

    /**
     * 1. Підрахунок загальної вартості амуніції.
     */
    public double calculateTotalCost() {
        double total = 0;
        for (Ammunition item : equipment) {
            total += item.getPrice();
        }
        return total;
    }

    /**
     * 2. Сортування амуніції за вагою (використовуємо Comparator).
     */
    public void sortEquipmentByWeight() {
        equipment.sort(Comparator.comparingDouble(Ammunition::getWeight));
    }

    /**
     * 3. Пошук амуніції у заданому діапазоні цін.
     */
    public List<Ammunition> findAmmunitionByPriceRange(double minPrice, double maxPrice) {
        if (minPrice > maxPrice) {
            System.err.println("Помилка: Мінімальна ціна більша за максимальну!");
            return new ArrayList<>();
        }
        
        List<Ammunition> result = new ArrayList<>();
        for (Ammunition item : equipment) {
            if (item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Виведення всієї амуніції на екран.
     */
    public void printEquipment() {
        if (equipment.isEmpty()) {
            System.out.println("Лицар роздягнений (амуніція відсутня).");
        } else {
            for (Ammunition item : equipment) {
                System.out.println(item);
            }
        }
    }
}