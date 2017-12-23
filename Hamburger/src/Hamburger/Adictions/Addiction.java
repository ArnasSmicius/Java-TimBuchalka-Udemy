package Hamburger.Adictions;

/**
 * Created by Arnas on 2017.04.12.
 */
public class Addiction {
    private double cost;
    private String name;

    public Addiction(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
