package dz3110;

public class ChemistryProduct extends Product {
    int combustion_temperature;

    public ChemistryProduct(String Name, String Id, String Category, double Price, int Quantity, int combustion_temperature)  {
        super(Name, Id, Category, Price, Quantity);
        this.combustion_temperature = combustion_temperature;
    }
    public void printInfo() {
        System.out.println("-------------------------------");
        System.out.println("Type: " + "dz3110.ChemistryProduct\n");
        System.out.println("Name: " + Name);
        System.out.println("Category: " + Category);
        System.out.println("Id: " + Id);
        System.out.println("Price: " + Price);
        System.out.println("Amount: " + Quantity + " (" + availability() + ")");
        System.out.println("combustion_temperature: " + combustion_temperature);
        System.out.println("-------------------------------");
    }

    public boolean sell(){
        if (Quantity > 0) {
            Quantity--;
            return true;
        }
        return false;
    }
}
