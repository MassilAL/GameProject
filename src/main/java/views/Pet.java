package views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Pet {
    OWL("malibu"),
    CAT("massimo"),
    TOAD("Tom"),
    RAT("Cla");

    private String name;
    private static List<Pet> Pet_LIST = null;

    static {
        Pet_LIST = new ArrayList<>();
        Pet_LIST.addAll(Arrays.asList(Pet.values()));
    }


    public static List<Pet> getPet() {
        return Collections.unmodifiableList(Pet_LIST);

    }
    //public Pet getPet() {
      //  return Pet_LIST;
    //};
    Pet(String name) {
        this.name = name;
    }


}
