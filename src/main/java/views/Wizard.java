package views;

import java.util.List;

import static Jeux.GameConsole.random;


public class Wizard extends Character {

  public int getPotions;


  private List<AbstractSpell> spells;
  private  House house;

  public Wizard(String nameWizard, int pv, int pvMax, int damage, int getPotions) {
    super(nameWizard, pv, pvMax, damage);
    this.getPotions = getPotions;
    this.wand = new Wand();
    this.house = generateHouse();
  }



  private Pet pet;
  private Wand wand;
  private List<Spell> KnownSpells;
  private List<Potion> potions;

  public String getNameWizard() {
    return Name;
  }

  public void setNameWizard(String nameWizard) {
    Name = (Color.GREEN.color)+nameWizard;
  }


  public Pet getPet() {
    return pet;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }

  public Wand getWand() {
    return wand;
  }

  public void setWand(Wand wand) {
    this.wand = wand;
  }

  public House getHouse() {
    return house;
  }

  public void setHouse(House house) {
    this.house = house;
  }

  public List<Spell> getKnownSpells() {
    return KnownSpells;
  }

  public void setKnownSpells(List<Spell> knownSpells) {
    KnownSpells = knownSpells;
  }

  public List<Potion> getPotions() {
    return potions;
  }

  public void setPotions(List<Potion> potions) {
    this.potions = potions;
  }

  public List<AbstractSpell> getSpells() {
    return spells;
  }

  public void setSpells(List<AbstractSpell> spells) {
    this.spells = spells;
  }

  static List<House> ListHouse=House.getValues();

  public House generateHouse(){
    return ListHouse.get(random.nextInt(ListHouse.size()));
  }

}
