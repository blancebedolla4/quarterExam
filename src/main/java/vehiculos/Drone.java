package vehiculos;

public class Drone implements Flyable{
    private String name;

    @Override
    public boolean transportsPassengers() {
        return false;
    }
}
