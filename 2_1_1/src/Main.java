import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] food = {"Картошка", "Морковка", "Курица", "Плов", "Квас"};
        int[] prices = {100, 400, 300, 299, 50};
        int[] quantityArray = new int[5];

        System.out.println("Список товаров для покупки:");
        for (int i = 0; i < food.length; i++) {
            System.out.println((i + 1) + ". " + food[i] + " - цена: " + prices[i] + " руб.");
        }

        while (true) {
            System.out.println("Введите номер товара и количество через пробел\n" +
                    "Либо \"end\" для завершения работы программы:");
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }

            String[] parts = line.split(" ");
            int product = Integer.parseInt(parts[0]) - 1;
            int quantity = Integer.parseInt(parts[1]);

            quantityArray[product] += quantity;

        }

        int sumFoodPrice = 0;
        System.out.printf("%-15s %-15s %-15s%n","Наименование:", "кол-во:", "стоимость:");
        for (int i = 0; i < food.length; i++) {
            sumFoodPrice = sumFoodPrice + quantityArray[i] * prices[i];
            System.out.printf("%-2d%-15s%-15d%-15d%n", (i + 1), food[i], quantityArray[i], (quantityArray[i] * prices[i]));
        }
        System.out.printf("%32s%-10d", "Итого: ", sumFoodPrice);
    }
}
