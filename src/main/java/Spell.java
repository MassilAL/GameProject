package main.java;

public class Spell extends AbstractSpell {

    public Spell(String name, int damage, String effect) {
        super(name, damage, effect);
    }
    public static Spell wingardiumLeviosa(){
        return new Spell("Wingardium Leviosa", 40,"bim");
    }
}
