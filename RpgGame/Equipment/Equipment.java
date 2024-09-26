package RpgGame.Equipment;

public class Equipment {
    public String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public equipmentAttributes getStatus() {
        return new equipmentAttributes(0, 0, 0);
    }
}
