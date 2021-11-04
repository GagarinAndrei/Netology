import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Сравнить");
        System.out.println("2. Отбросить дробную часть");
        System.out.println("3. Округлить");

        int operation = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case 1:
                System.out.println("Введите первое число");
                double firstNum = Double.parseDouble(scanner.nextLine());
                System.out.println("Введите второе число");
                float secondNum = Float.parseFloat(scanner.nextLine());
                if ((firstNum - secondNum) < 0.2) {
                    System.out.println("Числа равны!");
                } else {
                    System.out.println("Числа не равны");
                }
                break;
            case 2:
                System.out.println("Введите любое число");
                long longNumber = (long) Double.parseDouble(scanner.nextLine());
                System.out.println("Результат: " + longNumber);
                break;
            case 3:
                System.out.println("Введите любое число");
                double doubleNumber = Double.parseDouble(scanner.nextLine());
                System.out.println("Результат: " + Math.round(doubleNumber));
                break;
            default:
                System.out.println("Нет такой операции!");
                break;
        }


    }
}
