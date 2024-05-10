package vehicles;

import java.util.ArrayList;

public class AircraftCarrier extends Vehicle {

    private ArrayList<Vehicle> vehiclesOnBoard = new ArrayList<>();

    public AircraftCarrier () {
        super("defaultMake", "defaultModel", 0);
    }
}
