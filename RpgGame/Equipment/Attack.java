package RpgGame.Equipment;

public class Attack extends Weapons {
    public int attackPower;

    public Attack(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    public equipmentAttributes getAttack() {
        return new equipmentAttributes(0, this.attackPower, 0);
    }
}
