/**
 * Created by Arnas on 2017.04.09.
 */
public class Vehicle {
    private String name;
    private int size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int size){
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentDirection = direction;
        System.out.println("Current vehicle direction: " + this.currentDirection);
    }

    public void move(int direction, int velocity){
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle moves at" + this.currentDirection + " direction at " + this.currentVelocity + " velocity");
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
