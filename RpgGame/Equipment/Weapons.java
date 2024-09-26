package RpgGame.Equipment;

public class Weapons extends Equipment {
    private Integer attackPower;

    public Weapons(String name, Integer attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    public Integer getAttack() {
        return this.attackPower;
    }

    public equipmentAttributes getStatus() {
        return new equipmentAttributes(0, 0, 0);
    }
}
