package main.java;

import java.util.*;

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

    public static List<Core> getValues() {
        //return Collections.unmodifiableList(Pet_LIST);

    }

    Pet(String name) {
        this.name = name;
    }

}
