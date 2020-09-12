package picker;

import comparator.FruitStandComparator;
import matcher.FruitStandMatcher;
import model.FruitStand;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Picker {

    public int pickStand(List<FruitStand> fruitStands) {
        if (fruitStands.isEmpty()) return 0;
        if (fruitStands.size() == 1) return fruitStands.get(0).getSequence();
        Predicate<FruitStand> isBasicStand = FruitStandMatcher.isBasicStand();
        Comparator<FruitStand> basisComaprison = FruitStandComparator.compareBasiStands();
        FruitStand fruitStand = fruitStands.stream().filter(isBasicStand).min(basisComaprison).get();
        return fruitStand.getSequence();
    }
}
