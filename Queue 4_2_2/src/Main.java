import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int waitDoorsInSeconds = 10;
    public static int waitMoveInSeconds = 5;
    public static int totalSeconds = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> floorQueue = new ArrayDeque<>();

        int currentFloor;
        int previousFloor = -1;

        while (true) {
            System.out.println("Enter floor number.\n" +
                    "For exit press 0");
            currentFloor = scanner.nextInt();
            if (currentFloor == 0) {
                printFloors(floorQueue);
                break;
            }
            if ((currentFloor < 0) || (currentFloor > 25)) {
                System.out.println("Такого этажа нет!");
            } else {
                floorQueue.offer(currentFloor);
                totalSeconds += calcMoveInSeconds(currentFloor, previousFloor);
                totalSeconds += waitDoorsInSeconds;
                previousFloor = currentFloor;
            }

        }
    }

    public static void printFloors(Queue<Integer> floors) {
        while (!floors.isEmpty()) {
            System.out.println("Floor " + floors.poll());
        }
        System.out.println("Travel time: " + totalSeconds);
    }

    public static int calcMoveInSeconds(int currentFloor, int previousFloor) {
        if (previousFloor != -1) {
            return Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
        } else {
            return 0;
        }
    }
}
