package picker;

import junit.framework.TestCase;
import model.Fruit;
import model.FruitStand;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PickerTest extends TestCase {
    List<FruitStand> fruitStands = new ArrayList<>();
    Picker picker = new Picker();

    @Before
    public void setUp() throws Exception {
        fruitStands.addAll(Arrays.asList(
                new FruitStand(1, new HashSet<Fruit>(Arrays.asList(new Fruit("Peach", 11.0), new Fruit("Cherry", 18.0)))), // price 29
                new FruitStand(2, new HashSet<Fruit>(Arrays.asList(new Fruit("Peach", 17.0), new Fruit("Cherry", 13.0)))), // price 30
                new FruitStand(3, new HashSet<Fruit>(Arrays.asList(new Fruit("Peach", 15.0), new Fruit("Cherry", 19.0)))), // price 34
                new FruitStand(4, new HashSet<Fruit>(Arrays.asList(new Fruit("Peach", 14.0), new Fruit("Cherry", 22.0)))), // price 36
                new FruitStand(5, new HashSet<Fruit>(Arrays.asList(new Fruit("Peach", 12.0), new Fruit("Cherry", 7.0)))), // price 19
                new FruitStand(6, new HashSet<Fruit>(Arrays.asList(new Fruit("Peach", 11.0), new Fruit("Cherry", 78.0)))), // price 89
                new FruitStand(7, new HashSet<Fruit>(Arrays.asList(new Fruit("Peach", 10.0), new Fruit("Cherry", 18.0))))  // price 28
                )
        );
    }

    public void testPickStand_basic() {
        assertEquals(picker.pickStand(fruitStands), 5);
    }

    public void testPickStand_empty() {
        List<FruitStand> emptyList = new ArrayList<>();
        assertEquals(picker.pickStand(emptyList), 0);
    }
}