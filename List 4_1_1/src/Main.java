import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> toDoList = new ArrayList<String>();


        while (true) {
            printMainMenu();
            int menuItem = Integer.parseInt(scanner.nextLine());
            if (menuItem == 0) {
                System.out.println("Программа завершена!");
                break;
            }
            actionChooser(menuItem);
        }
    }

    public static void printMainMenu() {
        System.out.println("1. Добавить задачу\n" +
                "2. Вывести список задач\n" +
                "3. Удалить задачу\n" +
                "0. Выход");
    }

    public static void actionChooser(int menuItem) {
        switch (menuItem) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}

