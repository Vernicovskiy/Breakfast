package bsu.rfe.java.group6.lab1.Vernicovskiy.varA7;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {

        Random rand = new Random();
        String argument = "Cheese/IceCream/Apple";
        String[] parts = argument.split("/");
        String parts_Ice_0 = "шоколад/карамель";
        String[] parts_Ice = parts_Ice_0.split("/");
        String parts_Apl_0 = "большое/маленькое";
        String[] parts_Apl = parts_Apl_0.split("/");


        Food[] dessert = new Food[parts.length];

        for (int j = 0; j < parts.length; j++) {
            if (parts[j].equals("Cheese")) {

                dessert[j] = new Cheese();
            }
            if (parts[j].equals("IceCream")) {

                dessert[j] = new IceCream(parts_Ice[rand.nextInt(parts_Ice.length)]);

            }
            if (parts[j].equals("Apple")) {

                dessert[j] = new Apple(parts_Apl[rand.nextInt(parts_Apl.length)]);

            }
        }
        printFoods(dessert);
        dessert[1].consume();
        dessert[2].consume();

    }

    static void printFoods(Food[] dessert) {
        int c = 0;
        int p = 0;
        int s = 0;
        for (int i = 0; i < dessert.length; i++) {
            if (dessert[i] instanceof Apple) {
                s++;
            }

                if (dessert[i] instanceof Cheese) {
                    c++;
                } else if (dessert[i] instanceof IceCream) {
                    p++;
                }
            }
            System.out.println("CЫР - " + c);
            System.out.println("МОРОЖЕННОЕ - " + p);
            System.out.println("ЯБЛОКО - " + s);
        }


    }
