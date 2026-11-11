package dz711;

public class Launch {
    public static void main(String[] args) {

        Goods g = new Goods("Молоко", 98.5);

        System.out.println(g);

        Goods g2 = new Goods("Молоко", 102.3);

        System.out.println(g.equals(g2));

        Goods g3 = new Goods("Хлеб", 45);

        System.out.println(g.equals(g3));

    }
}
