import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuItem;

        List<String> toDoList = new ArrayList<>();

        while (true) {
            printMainMenu();
            menuItem = Integer.parseInt(scanner.nextLine());
            if (menuItem == 0) {
                System.out.println("Программа завершена!");
                break;
            }
            switch (menuItem) {
                case 1:
                    System.out.println("Введите задачу:");
                    toDoList.add(scanner.nextLine());
                    break;
                case 2:
                    printToDoList(toDoList);
                    break;
                case 3:
                    printToDoList(toDoList);
                    System.out.println("Какую задачу удалить?");
                    toDoList.remove((Integer.parseInt(scanner.nextLine()) - 1));
                    break;
            }
        }
    }

    public static void printMainMenu() {
        System.out.println("1. Добавить задачу\n" +
                "2. Вывести список задач\n" +
                "3. Удалить задачу\n" +
                "0. Выход");
    }

    public static void printToDoList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
        printLine();
    }

    public static void printLine() {
        System.out.println("=======================");
    }
}

