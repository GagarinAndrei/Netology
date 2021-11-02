import java.util.Scanner;

public class Main {


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        static int earnings = 0;
        static int spendings = 0;

        while (true) {
            System.out.println("Выберите операцию и введите её номер");
            System.out.println("1. Доход");
            System.out.println("2. Расход");
            System.out.println("3. Выбор системы налогообложения");

            String input = scanner.nextLine();


            if (input.equals("end")) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    moneyStr = scanner.nextLine();
                    money = Integer.parseInt(moneyStr);
                    spendings += money;
                    break;
                case 3:


            }

        }
        System.out.println("Программа завершена");
    }
}
