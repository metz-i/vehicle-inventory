package vehicles;

public class Aircraft extends Vehicle {

    private int numberOfEngines;
    private int numberOfCrew;
    private int numberOfPassengers;

    public Aircraft (String make, String model, int year, int numberOfEngines, int numberOfCrew, int numberOfPassengers) {
        super(make, model, year);
        this.numberOfEngines = numberOfEngines;
        this.numberOfCrew = numberOfCrew;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Aircraft () {
        super("defaultMake", "defaultModel", 0);
        this.numberOfEngines = 0;
        this.numberOfCrew = 0;
        this.numberOfPassengers = 0;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "numberOfEngines=" + numberOfEngines +
                ", numberOfCrew=" + numberOfCrew +
                ", numberOfPassengers=" + numberOfPassengers +
                '}';
    }
}
