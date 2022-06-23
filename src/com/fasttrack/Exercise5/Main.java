package com.fasttrack.Exercise5;

public class Main {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();

        System.out.println("Has liquid? - " + bottle.hasLiquid() + ".");
        System.out.println("Liquid left: " + bottle.getLeftMl() + " ml.");
        System.out.println("Empty space: " + bottle.getEmpty() + " ml.");
        bottle.openBottle();
        bottle.openBottle();
        bottle.setDrink(354);
        System.out.println("Liquid left: " + bottle.getLeftMl() + " ml.");
        bottle.closeBottle();
        bottle.setDrink(345);
        bottle.openBottle();
        bottle.setDrink(700);
        bottle.setDrink(124);
        System.out.println("Liquid left: " + bottle.getLeftMl() + " ml.");
        System.out.println("Has liquid? - " + bottle.hasLiquid() + ".");
        System.out.println("Empty space: " + bottle.getEmpty() + " ml.");
        bottle.closeBottle();
        bottle.closeBottle();
    }
}
