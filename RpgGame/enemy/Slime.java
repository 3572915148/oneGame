package RpgGame.enemy;

public class Slime extends RpgGame.enemy.Enemy {
    public int enemyHp;
    public int enemyAttack;
    public int enemyDefense;

    public Slime(String name, int enemyHp, int enemyAttack, int enemyDefense) {
        super(name);
        this.enemyHp = enemyHp;
        this.enemyAttack = enemyAttack;
        this.enemyDefense = enemyDefense;
    }
}
