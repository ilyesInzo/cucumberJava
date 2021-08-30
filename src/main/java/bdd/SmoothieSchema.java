package bdd;

import java.util.HashMap;
import java.util.Map;

public class SmoothieSchema {

    private Map<String, Integer> punkteProKategory = new HashMap<>();
    private DrinkCatalog drinkCatalog;

    SmoothieSchema(DrinkCatalog drinkCatalog) {

        this.drinkCatalog = drinkCatalog;
    }

    public void setPointByCategory(String kategory, Integer punkte) {
        punkteProKategory.put(kategory, punkte);

    }

    public int getPunktFor(String getrank) {
        return punkteProKategory.get(categoryOF(getrank));
    }

    private String categoryOF(String getrank) {

        return drinkCatalog.getCategoryOf(getrank);
    }
}
