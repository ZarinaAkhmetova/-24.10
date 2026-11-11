package dz3110;

import java.util.Random;
public class Oop {
    public static void main(String[] args){
        Product[] prods = new Product[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            if (random.nextDouble() > 0.5) {
                prods[i] = new ChemistryProduct("Cosmetics", "555", "Shimmer and Shine",
                        20860.0, 9, 130);
            }
            else {
                prods[i] = new FoodProduct("Bolshevichka", "777", "Food", 800.0, 0, -1);
            }
        }

        for (int i = 0; i < 10; i++) {
            prods[i].printInfo();
        }

        prods[0].sell();
        prods[0].printInfo();
    }
}
