package matcher;

import model.Fruit;
import model.FruitStand;

import java.util.function.Predicate;

public class FruitStandMatcher {

    private FruitStandMatcher(){

    }

    public static Predicate<FruitStand> isBasicStand() {
        return fruitStand -> {
            boolean peach = false;
            boolean cherry = false;
            for (Fruit fruit :
                    fruitStand.getFruits()) {
                if (fruit.getName().equalsIgnoreCase("Peach"))
                    peach = true;
                else if (fruit.getName().equalsIgnoreCase("Cherry"))
                    cherry = true;

                if (cherry && peach) return true;
            }
            return false;
        };
    }

}
