package vehiculos;

public class Plane extends Vehicle implements Flyable{
    public Plane(String name, int speed, double price, Engine engine, float taxt_amt) {
        super(name, speed, price, engine, taxt_amt);
    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }
}
