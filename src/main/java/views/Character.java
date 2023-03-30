package views;

public class Character extends Wizard {

    public Character(String NameWizard, int pvMax, int damage, int defence, int accuracy, Pet pet, Wand wand, House house) {
        super(NameWizard, pvMax, damage, defence, accuracy, pet, wand, house);
    }

    public int attack() {
        return 0;
    }

    public int defence() {
        return 0;
    }
}
