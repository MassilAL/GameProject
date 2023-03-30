package views;

public class Enemy extends Wizard{
    public String name;
    int wizardPv;
    public Enemy(String name, int pvMax, int damage, int defence, int accuracy, Pet pet, Wand wand, House house) {
        super(name, pvMax, damage, defence, accuracy, pet, wand, house);
    this.wizardPv=wizardPv;
        this.pvMax=wizardPv;
    }
    @Override
    public int attack(){
        return (int) (Math.random());
    }


}
