package RpgGame;

import RpgGame.Equipment.Attack;
import RpgGame.Equipment.Defense;
import RpgGame.Equipment.Potions;

public class RpgGame {
    static Attack greatSword = new Attack("大剑", 20);
    static Attack daggerSword = new Attack("短剑", 10);
    static Defense clothArmor = new Defense("布甲", 20);
    static Defense armour = new Defense("铁甲", 30);
    static Potions redWater = new Potions("腐败药水", 35);

    public static void start() {
        System.out.println("游戏开始");
        Player gamer = new Player("石柒", 100, 70, 30, 20);
        gamer.showPlayerStatus();

        gamer.addWepons(greatSword);
        gamer.addWepons(clothArmor);
        gamer.removeWepons("短剑");
        gamer.removeWepons("布甲");

        gamer.showPlayerStatus();

    }
}
