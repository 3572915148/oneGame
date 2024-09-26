package RpgGame.Equipment;

public class Defense extends Weapons {
    public int defensePower;

    public Defense(String name, int defensePower) {
        super(name);
        this.defensePower = defensePower;
    }

    public Integer getDefense() {
        return defensePower;
    }

    public equipmentAttributes getStatus() {
        return new equipmentAttributes(0, 0, this.defensePower);
    }
}
