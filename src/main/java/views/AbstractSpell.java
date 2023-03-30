package views;

public abstract class AbstractSpell {

    private String name;
    private int damage;
    private String effect;

    public AbstractSpell(String name, int damage, String effect) {
        this.name = name;
        this.damage = damage;
        this.effect = effect;
    }

}
