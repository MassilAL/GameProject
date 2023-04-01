package views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    public enum House {
        GRRYFINDOR,
        HUFFLEPUFF,
        SLYTHERIN;


        private static List<views.House> HOUSE_LIST = null;

        static {
            HOUSE_LIST = new ArrayList<>();
            HOUSE_LIST.addAll(Arrays.asList(House.values()));
        }

        public static List<views.House> getValues() {
            return Collections.unmodifiableList(HOUSE_LIST);

        }


}
