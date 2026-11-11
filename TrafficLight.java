package akhmetova;

public enum TrafficLight {
    GREEN(10),
    YELLOW(2),
    RED(7);

    private int time;

    TrafficLight(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public TrafficLight next(int m) {
        int cycle = GREEN.time + YELLOW.time + RED.time + YELLOW.time;
        int rest = m % cycle;
        if (rest < GREEN.time) {
            return GREEN;
        } else if (rest < GREEN.time + YELLOW.time) {
            return YELLOW;
        } else if (rest < GREEN.time + YELLOW.time + RED.time) {
            return RED;
        } else {
            return YELLOW;
        }
    }
}