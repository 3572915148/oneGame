package RGBGame.Equipment;

public class Defense extends Weapons {
    public int defensePower;

    public Defense(String name, int defensePower) {
        super(name);
        this.defensePower = defensePower;
    }

    public equipmentAttributes getDefense() {
        return new equipmentAttributes(0, 0, this.defensePower);
    }
}
