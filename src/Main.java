public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(1000, 50);
        boss.setWeapon(new Weapon("Cold weapon", "Sword"));
        System.out.println(boss.getHealth()+" "+ boss.getDamage()+" "+ boss.weapon.getName() + " "+ boss.weapon.getType());
       }
}
