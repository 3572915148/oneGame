package RpgGame.Equipment;

public class Attack extends Equipment {
    public int attackPower;

    public Attack(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    public Integer getAttack() {
        return attackPower;
    }

    public equipmentAttributes getStatus() {
        return new equipmentAttributes(0, this.attackPower, 0);
    }
}
