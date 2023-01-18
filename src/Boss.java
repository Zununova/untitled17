public class Boss extends GameEntity {

    String weaponName;



    public Boss(int health, int damage) {
        super(health, damage);


    }

    public Boss(int health, int damage,  String weaponName) {
        super(health, damage);
        this.weaponName = weaponName;
    }
}
