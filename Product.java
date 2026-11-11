package dz3110;

public abstract class Product implements printable, sellable {

    protected String Name;
    protected String Id;
    protected String Category;
    protected double Price;
    protected int Quantity;

    public Product(String Name, String Id, String Category, double Price, int Quantity) {

        setName(Name);
        this.Id = Id;
        setCategory(Category);
        setPrice(Price);
        setQuantity(Quantity);
    }

    public void setName(String Name) {
        if (Name.length() <= 45) {
            this.Name = Name;
        }
    }

    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }

    public void setCategory(String Category) {
        if (Category.length() <= 25) {
            this.Category = Category;
        }
    }

    public String getCategory() {
        return Category;
    }

    public void setPrice(double Price) {
        if (Price >= 0) {
            this.Price = Price;
        }
    }

    public double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        if (Quantity >= 0) {
            this.Quantity = Quantity;
        }
    }

    public String availability() {
        if (Quantity == 0) {
            return "not available now";
        } else if (Quantity >= 1 && Quantity <= 5) {
            return "product is running low";
        } else {
            return "product in stock";
        }
    }

    public void Skidka(int percent) {
        if (percent > 0 && percent <= 100) {
            Price = Price - Price * percent / 100;
        }
    }

    public void increaseKolvo(int kolvo) {
        if (kolvo > 0) {
            Quantity = Quantity + kolvo;
        }
    }

    public void decreaseKolvo(int kolvo) {
        if (kolvo > 0 && kolvo <= Quantity) {
            Quantity = Quantity - kolvo;
        }
    }

    public double sumOfSale(int amount) {
        if (amount > 0 && amount <= Quantity) {
            Quantity -= amount;
            return amount * Price;
        }
        return -1;
    }

    public void promo(String prom) {
        if ("Discount30".equals(prom)) {
            Skidka(30);
        } else if ("Discount60".equals(prom)) {
            Skidka(60);
        } else {
            System.out.println("Incorrect promo");
        }
    }

    public void printInfo() {
        System.out.println("-------------------------------");
        System.out.println("Name: " + Name);
        System.out.println("Category: " + Category);
        System.out.println("Id: " + Id);
        System.out.println("Price: " + Price);
        System.out.println("Amount: " + Quantity + " (" + availability() + ")");
        System.out.println("-------------------------------");
    }
}