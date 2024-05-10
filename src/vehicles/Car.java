package vehicles;

public class Car extends Vehicle {

    private int numberOfCylinders;
    private String color;
    private int numberOfDoors;

    public Car (String make, String model, int year, int numberOfCylinders, String color, int numberOfDoors) {
        super(make, model, year);
        this.numberOfCylinders = numberOfCylinders;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public Car () {
        super("defaultMake", "defaultModel", 0);
        this.numberOfCylinders = 0;
        this.color = "";
        this.numberOfDoors = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "numberOfCylinders=" + numberOfCylinders +
                ", color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
