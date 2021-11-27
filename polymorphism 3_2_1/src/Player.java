import ru.netology.weapons.*;

public class Player {
    final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Knife(),
                new Pistol(),
                new Shotgun(),
                new Machinegun()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < -1 || slot > weaponSlots.length || slot == 0) {
            System.out.println("Такого оружия нет!");
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }

    public void displaySlots() {
        for (int i = 0; i < weaponSlots.length; i++) {
            Weapon weaponSlot = weaponSlots[i];
            System.out.println((i + 1) + " - " + weaponSlot.getClass().getSimpleName());
        }
    }
}
