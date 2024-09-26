package RpgGame.character.player;

import RpgGame.Equipment.Equipment;
import RpgGame.Equipment.Inventory;
import RpgGame.Equipment.equipmentAttributes;
import RpgGame.character.Character;
import RpgGame.interfaces.Fight_I;

public class Player extends Character implements Fight_I<Character> {
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
        equipmentAttributes status = inventory.removeWepons(equipmentName);
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

    @Override
    public void attack(Fight_I<Character> hurtCharacter) {
        // TODO 后续可能有攻击暴击逻辑，可以在这里实现
        if (hurtCharacter instanceof Character) {
            Character character = (Character) hurtCharacter;
            System.out.println("玩家" + this.name + "攻击了" + character.name);
            hurtCharacter.getHurt(this.attack);
        } else {
            System.out.println("攻击对象不是一个有效的角色");
        }
    }

    @Override
    public void getHurt(Integer damage) {
        // TODO 护甲减伤逻辑

        System.out.println("玩家" + this.name + "受到了" + damage + "点伤害");

        // 确保血量不会小于0
        this.hp = Math.max(0, this.hp - damage);
        if (this.hp == 0) {
            System.out.println("玩家死亡，游戏结束!");
            System.exit(0);
        }
    }
}