package views;

import java.util.List;
import java.util.Random;

public class Wand {
    Random WandChoice=new Random();
    private int size;
    private Core core;
    static List<Core> ListCore=Core.getValues();

    public Wand(){
        this.size= WandChoice.nextInt(10, 30);
        this.core= ListCore.get(WandChoice.nextInt(ListCore.size()));
    }
    public int getSize() {return size;}

    public Core getCore() {
        return core;
    }
    public String toString(){
        return "your wand is: the wand of size"+size + "\" with a core of " + core.toString();
    }
}
