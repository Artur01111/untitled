public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");

        Boss boss = new Boss("Dark Lord", 500, 50, bossWeapon);
        boss.printInfo();

        System.out.println();

        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Bone Bow");
        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Shadow Bow");

        Skeleton skeleton1 = new Skeleton("Skeleton Archer", 100, 15, skeletonWeapon1, 20);
        Skeleton skeleton2 = new Skeleton("Skeleton Sniper", 120, 18, skeletonWeapon2, 30);

        skeleton1.printInfo();
        System.out.println();
        skeleton2.printInfo();
    }
}