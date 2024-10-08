package RpgGame;

import RpgGame.Equipment.Equipment;
import RpgGame.Equipment.equipmentAttributes;
import RpgGame.Characters_.*;

public class Player extends Characters {
    // 创建一个Player类，包含玩家的基本属性（如生命值、法力值、攻击力、防御力等）

    public Inventory inventory;

    public Player(String name, int hp, int blue, int attack, int defense) {
        super(name, hp, blue, attack, defense);
        this.inventory = new Inventory();
    }

    public void showPlayerStatus() {
        System.out.println("****************************************");
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.hp);
        System.out.println("Blue: " + this.blue);
        System.out.println("Attack: " + this.attack);
        System.out.println("Defense: " + this.defense);
        System.out.println("****************************************");
    }

    // 增加装备属性
    public void addEquipment(Equipment equipment) {
        equipmentAttributes status = inventory.addEquipment(equipment);
        this.applyequipmentAttributes(status, false);
    }

    // 删除装备属性
    public void removeEquipment(String equipmentName) {
        equipmentAttributes status = inventory.removeEquipment(equipmentName);
        this.applyequipmentAttributes(status, true);
    }

    public void applyequipmentAttributes(equipmentAttributes status, boolean isRemoved) {
        if (isRemoved) {
            // 将装备状态从玩家身上移除
            this.attack -= status.attackPower;
            this.defense -= status.defensePower;
            this.hp -= status.potionsPower;
            return;
        }

        // 将装备状态作用至玩家身上
        this.attack += status.attackPower;
        this.defense += status.defensePower;
        this.hp += status.potionsPower;
    }

}