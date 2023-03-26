package main.java;

//public class House {
    //public String name;
    public record House(String name) {

        public void houseEffect(Wizard wizard, Potion potion) {
            switch (this.name) {
                case "Slytherin" -> {
                    wizard.setDamage(wizard.getDamage() + 25);
                    wizard.setPet(Pet.RAT);
                }
                case "Gryffindor" -> {
                    wizard.setDefence(Wizard.getDefence()+ 20);
                    wizard.setPet(Pet.CAT);
                }
                case "Ravenclaw" -> {
                    wizard.setAccuracy(wizard.getAccuracy()+ 15);
                    wizard.setPet(Pet.OWL);
                }
                /*case "Hufflepuff" -> {
                    potion.setHeal(100);
                    wizard.setPet(Pet.TOAD);
                }*/
        }
    }
}
