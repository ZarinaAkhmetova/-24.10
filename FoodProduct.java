package dz711;

public class FoodProduct extends Product{
    private int shelf_life; // срок годности

    private boolean ready; // готов ли к употреблению

    public FoodProduct(String Name, String Id, String Category, double Price, int Quantity, int shelf_life, boolean ready) {

        super(Name, Id, Category, Price, Quantity);

        this.shelf_life = this.shelf_life;

        this.ready = ready;

    }

    @Override

    public void printInfo() {

        System.out.println("-------------------------------");

        System.out.println("Type: " + "FoodProduct\n");

        System.out.println("Name: " + Name);

        System.out.println("Category: " + Category);

        System.out.println("Id: " + Id);

        System.out.println("Price: " + Price);

        System.out.println("Amount: " + Quantity + " (" + availability() + ")");

        System.out.println("shelf_life: " + shelf_life);

        System.out.println("ready: " + ready);

        System.out.println("-------------------------------");

    }

    @Override

    public String availability() {

        if (shelf_life < 0) {

            return "not is expired";

        }

        if (Quantity == 0) {

            return "not available now";

        } else if (Quantity >= 1 && Quantity <= 5) {

            return "product is running low";

        } else {

            return "product in stock";

        }

    }

    @Override

    public boolean sell(){

        if (shelf_life < 0) {

            return false;

        }

        if (Quantity > 0) {

            Quantity--;

            return true;

        }

        return false;

    }

}
