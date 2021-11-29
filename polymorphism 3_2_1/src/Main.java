import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У вас %d слотов с оружием.%n"
                        + "Введите номер, что бы выстрелить%n"
                        + "-1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        while (true) {
            player.displaySlots();
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot - 1);
        }

        System.out.println("Game Over!");
    }
}
