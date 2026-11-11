package dz3110;

public class FoodProduct extends Product {
    int shelf_life;

    public FoodProduct(String Name, String Id, String Category, double Price, int Quantity, int shelf_life)  {
        super(Name, Id, Category, Price, Quantity);
        this.shelf_life = this.shelf_life;
    }

    public void printInfo() {
        System.out.println("-------------------------------");
        System.out.println("Type: " + "dz3110.FoodProduct\n");
        System.out.println("Name: " + Name);
        System.out.println("Category: " + Category);
        System.out.println("Id: " + Id);
        System.out.println("Price: " + Price);
        System.out.println("Amount: " + Quantity + " (" + availability() + ")");
        System.out.println("shelf_life: " + shelf_life);
        System.out.println("-------------------------------");
    }

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
