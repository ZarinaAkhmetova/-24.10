package akhmetova;
public class Launch {
    public static void main(String[] args) {

        TrafficLight trafficLight = TrafficLight.GREEN;

// через 10 секунд должен быть жёлтый

        System.out.println(trafficLight.next(10));

// через 15 - красный

        System.out.println(trafficLight.next(15));

// через 25 секунд должен снова быть зеленый

        System.out.println(trafficLight.next(25));

    }
}
