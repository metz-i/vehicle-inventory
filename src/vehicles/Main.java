package vehicles;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Instantiating car:
        Car sedan001 = new Car("Nissan", "Altima", 2006, 4, "cerulean", 4);
        System.out.println(sedan001);

        // Instantiating aircraft:
        Aircraft airbus321 = new Aircraft("Airbus", "A321-200", 2020, 32, 5, 180);

        // Instantiating aircraft carrier:
        AircraftCarrier saratoga = new AircraftCarrier();
        saratoga.loadVehicle(airbus321);
        System.out.println(saratoga);
        saratoga.loadVehicle(sedan001);
        System.out.println(saratoga);

    }
}



