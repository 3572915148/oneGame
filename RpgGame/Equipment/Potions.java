package RpgGame.Equipment;

public class Potions extends Equipment {
    public int potionsPower;

    public Potions(String name, int potionsPower) {
        super(name);
        this.potionsPower = potionsPower;
    }

    public Integer getPotions() {
        return potionsPower;
    }

    public equipmentAttributes getStatus() {
        return new equipmentAttributes(this.potionsPower, 0, 0);
    }
}
