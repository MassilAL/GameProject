package views;

import java.util.LinkedList;
import java.util.List;


public class Wizard {
  public String NameWizard;
  public int pv;
  public int pvMax;
  public int damage;

  private List<AbstractSpell> spells;

  public Wizard(String NameWizard, int pvMax, int damage, int defence, int accuracy, Pet pet, Wand wand, House house) {
    this.NameWizard = NameWizard;
    this.pv = pvMax;
    this.pvMax = pvMax;
    this.damage = damage;
    this.defence = defence;
    this.accuracy = accuracy;
    this.pet = pet;
    this.wand = wand;
    this.house = house;
    this.spells = new LinkedList<>();
  }

  public static int defence;
  public int accuracy;
  private Pet pet;
  private Wand wand;
  private House house;
  private List<Spell> KnownSpells;
  private List<Potion> potions;

  public String getNameWizard() {
    return NameWizard;
  }

  public void setNameWizard(String nameWizard) {
    NameWizard = nameWizard;
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

  public static int getDefence() {
    return defence;
  }

  public void setDefence(int defence) {
    this.defence = defence;
  }

  public int getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(int accuracy) {
    this.accuracy = accuracy;
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
}
