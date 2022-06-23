package com.fasttrack.Exercise5;

public class Bottle {
    private final int totalMl = 1000; // total capacity (milliliters)
    private int leftMl = totalMl; // available liquid (milliliters)
    private boolean open = false;

    public int getLeftMl() { // a method that returns the available liquid
        return leftMl;
    }

    public int getEmpty() { // a method that returns the empty capacity
        return totalMl - leftMl;
    }

    public boolean hasLiquid() { // a method that returns true/false if the bottle has more liquid
        return leftMl > 0; // if (leftMl > 0) return true; else return false;
    }

    public void openBottle() { // a method that opens the bottle and returns a message
        if (open) {
            System.out.println("Bottle is already open.");
        } else {
            open = true;
            System.out.println("Bottle is opened.");
        }
    }

    public void closeBottle() { // a method that closes the bottle and returns a message
        if (open) {
            open = false;
            System.out.println("Bottle is closed.");
        } else {
            System.out.println("Bottle is already closed.");
        }
    }

    public void setDrink(int drink) { // a method that drinks a specific amount of liquid  and returns a message
        if (open) {
            if (leftMl > 0) {
                if (drink <= leftMl) {
                    System.out.println("You drank " + drink + " ml.");
                    leftMl -= drink;
                } else {
                    System.out.println("There is not enough liquid. You only drank " + leftMl + " ml.");
                    leftMl = 0;
                }
            } else {
                System.out.println("Sorry, there is no liquid left.");
            }
        } else {
            System.out.println("You can't drink because the bottle is closed.");
        }
    }
}
