import java.util.Scanner;

public class Main {
    static int earnings = 0;
    static int spendings = 0;

    public static int taxEarningOnly(int earnings) {
        int tax = earnings * 6 / 100;
        return tax;
    }

    public static int taxEarningSpanding(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        }
        else {
            return 0;
        }
    }

    public static void comparisonTaxRate () {
        if (taxEarningOnly(earnings) < taxEarningSpanding(earnings, spendings)) {
            System.out.println("Советуем вам УСН доходы");
            System.out.println("Ставка налога в ней составит: " + taxEarningOnly(earnings));
            System.out.println("В другой системе: " + taxEarningSpanding(earnings, spendings));
            System.out.println();
        } else if (taxEarningOnly(earnings) > taxEarningSpanding(earnings, spendings)) {
            System.out.println("Советуем вам УСН доходы минус расходы");
            System.out.println("Ставка налога в ней составит: " + taxEarningSpanding(earnings, spendings));
            System.out.println("В другой системе: " + taxEarningOnly(earnings));
            System.out.println();
        } else {
            System.out.println("Можете выбрать любую систему, ставка налога одинаковая!");
            System.out.println();
        }

    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                    String moneyStr = scanner.nextLine();
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
                    System.out.println("Выберите систему налогообложения:");
                    System.out.println("1. УСН доходы");
                    System.out.println("2. УСН доходы минус расходы");
                    input = scanner.nextLine();
                        if (input.equals("end")) {
                            break;
                        }
                        operation = Integer.parseInt(input);
                        switch (operation) {
                            case 1:
                                System.out.println("Вы выбрали УСН доходы. Сумма налога: " + taxEarningOnly(earnings));
                                comparisonTaxRate();
                                break;
                            case 2:
                                System.out.println("Вы выбрали УСН доходы минус расходы. Сумма налога: " + taxEarningSpanding(earnings, spendings));
                                comparisonTaxRate();
                                break;
                            default:
                                break;
                        }

                    break;
                default:
                    System.out.println("Такой операции нет!");


            }

        }
        System.out.println("Программа завершена.");
    }
}
