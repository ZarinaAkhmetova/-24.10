package dz711;

public class ChemistryProduct extends Product{
    private int combustion_temperature; // температура возгорания

    private boolean liquid; // Жидкость или нет

    public ChemistryProduct(String Name, String Id, String Category, double Price, int Quantity, int combustion_temperature, boolean liquid) {

        super(Name, Id, Category, Price, Quantity);

        this.combustion_temperature = combustion_temperature;

        this.liquid = liquid;

    }

    @Override

    public void printInfo() {

        System.out.println("-------------------------------");

        System.out.println("Type: " + "ChemistryProduct\n");

        System.out.println("Name: " + Name);

        System.out.println("Category: " + Category);

        System.out.println("Id: " + Id);

        System.out.println("Price: " + Price);

        System.out.println("Amount: " + Quantity + " (" + availability() + ")");

        System.out.println("combustion_temperature: " + combustion_temperature);

        System.out.println("liquid: " + liquid);

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
