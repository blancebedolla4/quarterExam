package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // creating instance of plane, boat, car and truck
        Plane plane = new Plane("Boeing","5000",50,000);
        Boat boat = new Boat();
        Car car = new Car();
        Truck truck = new Truck();
        // create an Arraylist of Vehicles
        List<Vehicle> vehiclesList = new ArrayList<>();

    }
}
