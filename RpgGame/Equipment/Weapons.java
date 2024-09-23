package RpgGame.Equipment;

public class Weapons {
    public String name;

    public Weapons(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public equipmentAttributes getStatus() {
        return new equipmentAttributes(0, 0, 0);
    }
}
