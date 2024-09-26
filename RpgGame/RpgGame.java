package RpgGame;

import RpgGame.Equipment.Weapons;
import RpgGame.Equipment.Defense;
import RpgGame.Equipment.Potions;

public class RpgGame {
    static Weapons greatSword = new Weapons("大剑", 20);
    static Weapons daggerSword = new Weapons("短剑", 10);
    static Defense clothArmor = new Defense("布甲", 20);
    static Defense armour = new Defense("铁甲", 30);
    static Potions redWater = new Potions("腐败药水", 35);

    public static void start() {
        System.out.println("游戏开始");
        Player gamer = new Player("石柒", 100, 70, 30, 20);
        gamer.showPlayerStatus();

        gamer.addEquipment(greatSword);
        gamer.addEquipment(clothArmor);
        gamer.removeEquipment("短剑");
        gamer.removeEquipment("布甲");

        gamer.showPlayerStatus();

    }
}
