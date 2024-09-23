package RpgGame.Equipment;

public class Potions extends Weapons {
    public int potionsPower;

    public Potions(String name, int potionsPower) {
        super(name);
        this.potionsPower = potionsPower;
    }

    public equipmentAttributes getPotions() {
        return new equipmentAttributes(this.potionsPower, 0, 0);
    }
}
