public abstract class  Hero implements HavingSuperAbility {
private int health;
private int damage;
private String typeOfTheSuperpower;

    public String getTypeOfTheSuperpower() {
        return typeOfTheSuperpower;
    }

    public void setTypeOfTheSuperpower(String typeOfTheSuperpower) {
        this.typeOfTheSuperpower = typeOfTheSuperpower;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void applySuperAbility() {

    }



}
