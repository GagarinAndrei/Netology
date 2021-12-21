import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> floorQueue = new ArrayDeque<>();

        int floor;
        while (true) {
            System.out.println("Введите номер этажа. Для завершения введите 0");
            floor = scanner.nextInt();
            if (floor == 0) {
                printFloors(floorQueue);
                break;
            }
            if ((floor < 0) || (floor > 25)) {
                System.out.println("Такого этажа нет!");
            } else {
                floorQueue.offer(floor);
            }

        }
    }
    public static void printFloors(Queue<Integer> floors) {
        while (!floors.isEmpty()) {
            System.out.print("этаж " + floors.poll() + " => ");
        }
    }
}
