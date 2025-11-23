public class Lab5 {
    public static void main(String[] args) {
        try {
            // Створюємо лицаря
            Knight knight = new Knight();

            // Створюємо елементи амуніції (Поліморфізм: посилання типу Ammunition, об'єкти спадкоємців)
            Ammunition helmet = new Helmet("Шолом 'Салад'", 2.5, 150.0, "Закритий");
            Ammunition chestPlate = new Armor("Міланська кіраса", 12.0, 500.0, 80);
            Ammunition boots = new Armor("Залізні чоботи", 3.5, 120.0, 30);
            Ammunition sword = new Weapon("Дворучний меч", 4.0, 300.0, 95.5);
            Ammunition dagger = new Weapon("Мізерикордія", 0.8, 80.0, 40.0);

            // Екіпіруємо лицаря
            knight.equip(helmet);
            knight.equip(chestPlate);
            knight.equip(boots);
            knight.equip(sword);
            knight.equip(dagger);

            System.out.println("=== 🛡️ Початковий стан амуніції лицаря ===");
            knight.printEquipment();

            // 1. Розрахунок вартості
            System.out.println("\n=== 💰 Загальна вартість амуніції ===");
            System.out.printf("Всього: %.2f золотих%n", knight.calculateTotalCost());

            // 2. Сортування за вагою
            System.out.println("\n=== ⚖️ Сортування амуніції за вагою (зростання) ===");
            knight.sortEquipmentByWeight();
            knight.printEquipment();

            // 3. Пошук за ціною
            double min = 100.0;
            double max = 350.0;
            System.out.println("\n=== 🔍 Пошук амуніції в діапазоні цін (" + min + " - " + max + ") ===");
            
            var foundItems = knight.findAmmunitionByPriceRange(min, max);
            if (foundItems.isEmpty()) {
                System.out.println("Предметів у такому ціновому діапазоні не знайдено.");
            } else {
                for (Ammunition item : foundItems) {
                    System.out.println(item);
                }
            }

        } catch (Exception e) {
            System.err.println("Виникла помилка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}