package model;

import java.util.Set;

public class FruitStand{
    private int sequence;
    private Set<Fruit> fruits;

    public FruitStand() {
    }

    public FruitStand(int sequence, Set<Fruit> fruits) {
        this.sequence = sequence;
        this.fruits = fruits;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public Set<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(Set<Fruit> fruits) {
        this.fruits = fruits;
    }

}
