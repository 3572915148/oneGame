package RGBGame.Equipment;

import java.util.HashMap;

//装备属性
public class equipmentAttributes {
    public int potionsPower;
    public int attackPower;
    public int defensePower;

    public equipmentAttributes(int potionsPower, int attackPower, int defensePower) {
        this.potionsPower = potionsPower;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public HashMap<String, Integer> getStatus() {
        return new HashMap<String, Integer>() {
            {
                put("potionsPower", potionsPower);
                put("attackPower", attackPower);
                put("defensePower", defensePower);
            }
        };
    }
}
