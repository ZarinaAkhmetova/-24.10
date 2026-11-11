package dz711;
import java.util.Objects;
public class Goods {
    private String name;

    private double cost;

    public Goods(String name, double cost) {

        this.name = name;

        this.cost = cost;

    }

    @Override

    public boolean equals(Object o) {

        if (o == this) {

            return true;

        }

        if (o == null || !o.getClass().equals(this.getClass())) {

            return false;

        }

        Goods g = (Goods)o;

        return name.equals(g.name) && Double.compare(cost, g.cost) == 0;

    }

    @Override

    public int hashCode() {

        return Objects.hash(name, cost);

    }

    @Override

    public String toString() {

        return "{" + name + ", цена: " + cost + "}";

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public double getCost() {

        return cost;

    }

    public void setCost(double cost) {

        this.cost = cost;

    }
}
