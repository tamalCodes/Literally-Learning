import decorator.Burger;
import misc.TanduriBurger;
import misc.ZingerBurger;
import types.ExtraCheese;
import types.ExtraMayo;

public class Shop {
    public static void main(String[] args) throws Exception {

        Burger burger = new TanduriBurger();
        // System.out.println(burger.getDescription());

        burger = new ExtraCheese(burger);
        System.out.println(burger.getDescription());
        System.out.println("It will cost you Rs. " + burger.getCost() + "/-");

    }
}
