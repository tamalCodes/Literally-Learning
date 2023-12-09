package misc;

import decorator.Burger;

public class TanduriBurger extends Burger {
    @Override
    public String getDescription() {
        return "Tandoori Burger";
    }

    @Override
    public double getCost() {
        return 150.0;
    }
}
