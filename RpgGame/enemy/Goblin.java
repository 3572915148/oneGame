package RpgGame.enemy;

public class Goblin extends Enemy {
    public int enemyHp;
    public int enemyAttack;
    public int enemyDefense;

    public Goblin(String name, int enemyHp, int enemyAttack, int enemyDefense) {
        super(name);
        this.enemyHp = enemyHp;
        this.enemyAttack = enemyAttack;
        this.enemyDefense = enemyDefense;
    }
}
