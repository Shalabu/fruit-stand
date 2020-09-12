package main;


import picker.Picker;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Picker picker = new Picker();
        int bestStand = picker.pickStand(new ArrayList<>());
        System.out.println("The best price for Peach and Cherry is on fruit stand number: " + bestStand);
    }
}
