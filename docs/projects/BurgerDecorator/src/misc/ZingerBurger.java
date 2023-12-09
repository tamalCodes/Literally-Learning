package misc;

import decorator.Burger;

public class ZingerBurger extends Burger {

    @Override
    public String getDescription() {
        return "Here's your Zinger Burger";
    }

    @Override
    public double getCost() {
        return 180.0;
    }

}
