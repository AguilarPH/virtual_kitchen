package model;

public enum IngredientList {
    CHICKEN_PIECE("Chicken", 21),
    BREAD_CRUMBS_KG("Bread Crumbs", 5),
    OIL_LTR("OIL", 10),
    EGG("Egg", 18),
    CHICKEN_SEASONING_KG("Chicken Seasoning", 3),
    BURGER_BUNS("Burger Bun", 16),
    GROUNDED_MEAT_KG("Grounded Meat", 10),
    MEAT_SEASONING_KG("Meat Seasoning", 4),
    CHEESE_SLICE("Cheese slice", 8),
    SECRET_DRESSING_LTR("Secret Dressing", 4),
    BABY_BACK_RIBS_RACK("Baby Back Ribs", 30),
    BBQ_SAUCE_LTR("BBQ Sauce", 10),
    POTATOES_KG("Potato", 20),
    SALT_KG("Salt", 10),
    SPECIAL_SEASONING_KG("Special Seassoning", 5),
    MILK_LTR("Milk", 12),
    WHIPPED_CREAM_LTR("Whipped Cream", 24),
    VANILLA_ICECREAM_LTR("Vanilla Icecream", 15),
    ROOT_BEER_LTR("Root Beer", 24);

    private String name;
    private double stock;

    IngredientList(String name, double stock) {
        this.name = name;
        this.stock = stock;

    }

    public String getName() {
        return name;
    }

    public double getStock() {
        return stock;
    }
}
