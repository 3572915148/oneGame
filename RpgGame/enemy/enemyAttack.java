package RpgGame.enemy;

import RpgGame.Characters_.Characters_test;

public class enemyAttack {

    public abstract class Fight extends Characters_test {
        public Fight(String name, int hp, int blue, int attack, int defense) {
            super(name, hp, blue, attack, defense);
        }

        @Override
        public void enemyAttack(Character hurtCharacter) {
            System.out.println("敌人" + this.name + "攻击了" + hurtCharacter.name);
            hurtCharacter.getHurt(this.attack);

        }

        @Override
        public void getHurt(int hurt) {
            // 确保血量不会小于0

            System.out.println("敌人" + this.name + "受到了" + hurt + "点伤害");

            this.hp = Math.max(0, this.hp - hurt);
            if (this.hp <= 0) {
                System.out.println("敌人" + this.name + "已死亡");
            }
        }
    }

}