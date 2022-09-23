public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.setHealth(200);
        warrior.setDamage(100);
        warrior.setTypeOfTheSuperpower("Attack");
        System.out.println("Warrior применил суперспособность" + " " + warrior.getTypeOfTheSuperpower());

        Medic medic = new Medic();
        medic.setHealth(100);
        medic.setDamage(0);
        medic.setHealPoints(200);
        medic.setTypeOfTheSuperpower("Medical help");
        System.out.println("Medic применил суперспособность" + " " + medic.getTypeOfTheSuperpower() + " " + medic.getHealPoints());

        Magic magic = new Magic();
        magic.setHealth(150);
        magic.setDamage(50);
        magic.setTypeOfTheSuperpower("Magical attack");
        System.out.println("Magic применил суперспособность" + " " + magic.getTypeOfTheSuperpower());


        Hero[] heroes = {magic,medic,warrior};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }


    }
}