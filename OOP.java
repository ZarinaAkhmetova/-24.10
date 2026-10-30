class Product{
    private String Name;
    private String Id;
    private String Category;
    private double Price;
    private int Quantity;

    public Product(String Name, String Id, String Category, double Price, int Quantity){
        setName(Name);
        this.Id = Id;
        setCategory(Category);
        setPrice(Price);
        setQuantity(Quantity);
    }

    public void setName(String Name){
        if (Name.length() <= 45){
            this.Name = Name;
        }
    }

    public String getName(){
        return Name;
    }

    public String getId(){
        return Id;
    }

    public void setCategory(String Category){
        if (Category.length() <= 25){
            this.Category = Category;
        }
    }

    public String getCategory(){
        return Category;
    }


    public void setPrice(double Price){
        if (Price >= 0){
            this.Price = Price;
        }
    }

    public double getPrice(){
        return Price;
    }

    public int getQuantity(){
        return Quantity;
    }

    public void setQuantity(int Quantity){
        if (Quantity >= 0){
            this.Quantity = Quantity;
        }
    }

    
    public String availability(){ 
        if (Quantity == 0){
            return "not available now";
        } else if (Quantity >= 1 && Quantity <= 5) {
            return "product is running low";
        } else {
            return "product in stock";
        }
    }

    
    

    public void Skidka(int percent){
        if (percent > 0 && percent <= 100){
            price = price - price * percent / 100;
        }
    }

    public void increaseKolvo(int kolvo){
        if (kolvo > 0){
            Quantity = Quantity + kolvo;
        }
    }

    public void decreaseKolvo(int kolvo){
        if (kolvo > 0 && kolvo <= Quantity){
            Quantity = Quantity - kolvo;
        }
    }

    public double sumOfSale(int amount) {
        if (amount > 0 && amount <= Quantity) {
            Quantity -= amount;
            return amount * price;
        }
        return -1;
    }

    public void promo(String prom){
        if ("Discount30".equals(prom)){
            Skidka(30);
        } else if ("Discount60".equals(promik)){
            Skidka(60);
        } else { 
            System.out.println("Incorrect promo");
        }
    }

    public void printInfo() {
    System.out.println("Name: " + Name);
    System.out.println("Category: " + Category);
    System.out.println("Id: " + Id);
    System.out.println("Price: " + Price);
    System.out.println("Amount: " + Quantity + " (" + availability() + ")");
   
}



public class OOP{
    public static void main(String[] args){
        Product p1 = new Product("Cosmetics", "555", "Shimmer and Shine", 20860.0, 9);
        
        p1.printInfo();
        p1.Skidka(30);
        System.out.println("price after sale: " + p1.getPrice());
        p1.promo("Discount30");
        System.out.println("price after promo: " + p1.getPrice());
        p1.increaseKolvo(10);
        System.out.println("after increasing: " + p1.getQuantity());
        p1.decreaseKolvo(2);
        System.out.println("after decreasing: " + p1.getQuantity());
        double sum = p1.sumOfSale(3);
        System.out.println("Sale total: " + sum);
        System.out.println("Remaining: " + p1.getQuantity());

        System.out.println("Sale of 100 pcs: " + p1.sumOfSale(100));

        System.out.println(p1.availability());

        p1.setPrice(600);
        p1.printInfo();

        

        Product p2 = new Product("Zara", "777", "Clothing", 800.0, 0);
        p2.printInfo();
        System.out.println(p2.availability());
    }
}