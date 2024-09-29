package RpgGame.Characters_;

public abstract class Characters_test {
    public String name;
    public int hp;
    public int blue;
    public int attack;
    public int defense;

    public Characters_test(String name, int hp, int blue, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.blue = blue;
        this.attack = attack;
        this.defense = defense;
    }

    public abstract void enemyAttack(Character hurtCharacter);

    public abstract void playerAttack(Character hurtCharacter);

    public abstract void getHurt(int hurt);
}
