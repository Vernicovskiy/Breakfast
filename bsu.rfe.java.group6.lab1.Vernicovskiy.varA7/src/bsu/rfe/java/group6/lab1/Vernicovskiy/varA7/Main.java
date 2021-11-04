package bsu.rfe.java.group6.lab1.Vernicovskiy.varA7;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {

        Random rand = new Random();
        String argument = "Cheese/IceCream";
        String[] parts = argument.split("/");
        String parts_Ice_0 = "шоколад/карамель";
        String[] parts_Ice = parts_Ice_0.split("/");

        Food[] dessert = new Food[parts.length];

        for (int j = 0; j < parts.length; j++ ) {
            if (parts[j].equals("Cheese")) {

                dessert[j] = new Cheese();
            }
            if (parts[j].equals("IceCream")) {

                dessert[j] = new IceCream (parts_Ice[rand.nextInt(parts_Ice.length)]);

            }
        }
        printFoods(dessert);
        dessert[1].consume();
    }
    static void printFoods(Food[] dessert){
        int c = 0;
        int p = 0;
        for (int i = 0; i < dessert.length; i++) {

            if (dessert[i] instanceof Cheese) {
                c++;
            } else if (dessert[i] instanceof IceCream) {
                p++;
            }
        }
        System.out.println("CЫР - " + c);
        System.out.println("МОРОЖЕННОЕ - " + p);
    }


}
