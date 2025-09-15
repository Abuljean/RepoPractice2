public class Monster {
    protected int health;
    protected int damage;
    public int damageReceived;


    public Monster(int health, int damage) {
        health = this.health;
        damage = this.damage;
    }
    public Monster() {
        health = 100;
        damage = 10;
    }

    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }

    public boolean damageTaken(int enemyDamage) {//this records the damage taken, and if more than
        this.damageReceived += enemyDamage;
        boolean alive = aliveCheck(this.damageReceived);
        if(alive) {
            this.health -= this.damageReceived;
        }
        return alive;
    }

    public int attack(Monster monster) {
        monster.damageTaken(this.getDamage());
        return this.getDamage();
    }
    public void speak() {
        System.out.println("hello");
    }

    public boolean aliveCheck(int enemyAttack) {
        return this.getHealth() - enemyAttack > 0;
    }

    public void die(boolean isAlive) {
        if (!isAlive) {
            this.damage = 0;
            this.health = 0;
        }
    }
}