package RpgGame;

public class Player {
    // 创建一个Player类，包含玩家的基本属性（如生命值、法力值、攻击力、防御力等）
    public String name;
    public int hp;
    public int blue;
    public int attack;
    public int defense;

    public Player(String name, int hp, int blue, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.blue = blue;
        this.attack = attack;
        this.defense = defense;
        // this.inventory = new Inventory();
    }

}