package views;

public class Character {

    public String Name;
    public int pv;
    public int pvMax;
    public int damage;

    public Character(String name, int pv, int pvMax, int damage) {
        this.Name = name;
        this.pv = pv;
        this.pvMax = pvMax;
        this.damage = damage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPvMax() {
        return pvMax;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int attack() {
        return 0;
    }


}
