package RGBGame;

import java.util.HashMap;
import RGBGame.Equipment.Weapons;
import RGBGame.Equipment.equipmentAttributes;

// import java.util.HashMap;

public class Inventory {
    // 创建一个Inventory类，用于管理玩家的装备栏。
    // 装备栏可以存储不同类型的装备（如武器、防具、药水等）。
    public HashMap<String, Weapons> inventoryBloc;
    public int maxSize;

    public Inventory(HashMap<String, Weapons> inventoryBloc, int maxSize) {
        this.inventoryBloc = inventoryBloc;
        this.maxSize = 6;
    }

    // 实现添加
    public Weapons addWepons(Weapons equipment) {
        if (inventoryBloc.size() > maxSize) {
            System.out.println("对不起，你的装备栏已满");
        } else {
            this.inventoryBloc.put(equipment.getName(), equipment);
            System.out.println("装备" + equipment.getName() + "添加成功！");
            // TODO: 相应的属性添加
        }
        return null;
    }

    // 移除功能。
    public equipmentAttributes removeWepons(String equipmentName) {
        if (this.inventoryBloc.containsKey(equipmentName)) {
            Weapons equipment = this.inventoryBloc.get(equipmentName);
            equipmentAttributes status = equipment.getStatus();
            this.inventoryBloc.remove(equipmentName);
            System.out.println("装备" + equipmentName + "删除成功！");
            return status;
        }
        return null;
    }

    // 查看装备
    public void viewWeapons() {
        for (int i = 1; i < inventoryBloc.size(); i++) {
            System.out.println(this.inventoryBloc);
        }
    }

    // 每种装备应有不同的属性加成（如增加攻击力、防御力、恢复生命值等）。

}
