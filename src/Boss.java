public class Boss {
    private int health;
    private int damage;
    private String defenceType;

    public void setHealth(int health){
        this.health = health;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setDefenceType(String defenceType){
        this.defenceType = defenceType;
    }

    public int getHealth(){
        return this.health;
    }

    public int getDamage(){
        return this.damage;
    }

    public String getDefenceType(){
        return this.defenceType;
    }
}
