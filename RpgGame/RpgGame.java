package RpgGame;

import RpgGame.Equipment.Attack;
import RpgGame.Equipment.Defense;
import RpgGame.Equipment.Potions;

public class RpgGame {
    public Attack greatSword = new Attack("大剑", 20);
    public Attack daggerSword = new Attack("短剑", 10);
    public Defense clothArmor = new Defense("布甲", 20);
    public Defense armour = new Defense("铁甲", 30);
    public Potions redWater = new Potions("腐败药水", 35);

    public static void start() {
        System.out.println("游戏开始");
        Player gamer = new Player("石柒", 100, 70, 30, 20);

    }
}
