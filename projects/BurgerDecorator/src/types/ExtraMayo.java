package types;

import decorator.Burger;

public class ExtraMayo extends BurgerDecorator {

    private Burger burger;

    public ExtraMayo(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra mayo";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 20.0;
    }

}
