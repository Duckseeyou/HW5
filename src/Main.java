import kg.emir.hw5.templates.Hero;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("magic");

        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defence: " + boss.getDefenceType());
        System.out.println();

        for (Hero hero : createHeroes()){
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println();
        }


    }

    public static Hero[] createHeroes(){
        Hero mage = new Hero(250, 20, "Fireball");
        Hero tank = new Hero(400, 10);
        Hero archer = new Hero(220, 25, "Powershot");

        Hero[] Heroes = {mage, tank, archer};

        return Heroes;
    }
}