package RpgGame.equipment;

public class Potions extends Equipment {
    public Integer potionsPower;

    public Potions(String name, Integer potionsPower) {
        super(name);
        this.potionsPower = potionsPower;
    }

    public Integer getPotion() {
        return potionsPower;
    }

    public equipmentAttributes getStatus() {
        return new equipmentAttributes(this.potionsPower, 0, 0);
    }
}
