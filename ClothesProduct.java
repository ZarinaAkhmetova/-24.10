package dz711;

public class ClothesProduct extends Product{
    private int size; // размер одежды

    private String material; // Материал, из которого сшито (ткань)

    public ClothesProduct(String Name, String Id, String Category, double Price, int Quantity, int size, String material) {

        super(Name, Id, Category, Price, Quantity);

        this.size = size;

        this.material = material;

    }

    @Override

    public void printInfo() {

        System.out.println("-------------------------------");

        System.out.println("Type: " + "ClothesProduct\n");

        System.out.println("Name: " + Name);

        System.out.println("Category: " + Category);

        System.out.println("Id: " + Id);

        System.out.println("Price: " + Price);

        System.out.println("Amount: " + Quantity + " (" + availability() + ")");

        System.out.println("size: " + size);

        System.out.println("material: " + material);

        System.out.println("-------------------------------");

    }

    @Override

    public boolean sell(){

        if (Quantity > 0) {

            Quantity--;

            return true;

        }

        return false;

    }

}
