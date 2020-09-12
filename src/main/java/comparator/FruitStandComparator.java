package comparator;

import model.Fruit;
import model.FruitStand;

import java.util.Comparator;

public class FruitStandComparator {

    private FruitStandComparator(){

    }

    public static Comparator<FruitStand> compareBasiStands() {
        return (o1, o2) -> {
            double price1 = 0;
            double price2 = 0;
            for (Fruit fruit :
                    o1.getFruits()) {
                if (fruit.getName().equalsIgnoreCase("Peach") || fruit.getName().equalsIgnoreCase("Cherry")) {
                    price1 += fruit.getPrice();
                }
            }
            for (Fruit fruit :
                    o2.getFruits()) {
                if (fruit.getName().equalsIgnoreCase("Peach") || fruit.getName().equalsIgnoreCase("Cherry")) {
                    price2 += fruit.getPrice();
                }
            }
            if (price1 > price2)
                return 1;
            else
                return -1;
        };
    }
}
