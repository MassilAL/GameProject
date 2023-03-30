package views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Core {
    PHOENIX_FEATHER,
    DRAGON_HEARTSTRING,
    UnicornTail_hair,
    Troll_whisker;


    private static List<Core> CORE_LIST = null;

    static {
        CORE_LIST = new ArrayList<>();
        CORE_LIST.addAll(Arrays.asList(Core.values()));
    }

    public static List<Core> getValues() {
        return Collections.unmodifiableList(CORE_LIST);

    }
}
