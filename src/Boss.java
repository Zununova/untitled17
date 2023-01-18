public class Boss extends GameEntity {

    Weapon weapon;
    public Boss(int health, int damage) {
        super(health, damage);
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }
}
