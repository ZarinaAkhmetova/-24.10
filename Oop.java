package dz711;
import java.util.Random;
public class Oop {
    public static void main(String[] args){

        Product[] prods = new Product[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {

            if (random.nextDouble() < 0.33) {

                prods[i] = new ChemistryProduct("Cosmetics", "555", "Shimmer and Shine",

                        20860.0, 9, 130, true);

            }

            else if (random.nextDouble() < 0.66) {

                prods[i] = new FoodProduct("Bolshevichka", "777", "Food", 800.0, 0, -1, true);

            } else {

                prods[i] = new ClothesProduct("Bloose", "333", "Clothes", 1000.0, 2, 46, "Cotton");

            }

        }

        for (int i = 0; i < 10; i++) {

            prods[i].printInfo();

        }

        prods[0].sell();

        prods[0].printInfo();

    }
}
