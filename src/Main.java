public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(1000, 50, "Sword");
        System.out.println(boss.getHealth()+" "+ boss.getDamage()+" "+ boss.weaponName);
    }
}