public class Vampire extends Monster {
    public Vampire(int health, int damage) {
        super(health, damage);
    }

    public int getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;
    }

    public void speak() {
        System.out.println("mmmmmm... Blood, a delicacy!");
    }

}
