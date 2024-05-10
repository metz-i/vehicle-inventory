package vehicles;

import java.util.ArrayList;

public class AircraftCarrier extends Vehicle {

    private ArrayList<Vehicle> vehiclesOnBoard = new ArrayList<>();

    public void loadVehicle(Vehicle vehicle) {
        vehiclesOnBoard.add(vehicle);
    }

    public AircraftCarrier () {
        super("defaultMake", "defaultModel", 0);

        // Initializing empty vehiclesOnBoard array:
        this.vehiclesOnBoard = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "AircraftCarrier{" +
                "vehiclesOnBoard=" + vehiclesOnBoard +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
