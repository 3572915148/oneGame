package RpgGame.enemy;

import RpgGame.Characters_.Characters;

public abstract class Slime extends Characters {

    public Slime(String name, int enemyHp, int enemyAttack, int enemyDefense) {
        super(name, enemyHp, enemyHp, enemyAttack, enemyDefense);
    }
}
