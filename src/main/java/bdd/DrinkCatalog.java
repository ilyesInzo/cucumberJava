package bdd;

import java.util.HashMap;
import java.util.Map;

public class DrinkCatalog {
    private Map<String,String> drinkCategories = new HashMap<>();
    public void addDrink(String getrank, String kategory) {
        drinkCategories.put(getrank,kategory);
    }

    public String getCategoryOf(String getrank) {
        return drinkCategories.get(getrank);
    }
}
