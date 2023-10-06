package vehiculos;

public abstract class Vehicle extends Product {

    private int speed;
    private double price;
    private Engine engine;

    // constructor
    public Vehicle(String name, int speed, double price, Engine engine, float taxt_amt) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
        this.taxt_amt = taxt_amt;
    }

    //getters and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getTaxt_amt() {
        return taxt_amt;
    }

    public void setTaxt_amt(float taxt_amt) {
        this.taxt_amt = taxt_amt;
    }

    // protected variable with default value of 0.10
    protected float taxt_amt = 0.10f;


    public Vehicle(String name) {
        super(name);
    }

    // method to print vehicle type
    public void printVehicleType() {
        System.out.println("Vehicle Type: " + this.getClass().getSimpleName());
    }

    //method to get price after tax
    public float getPriceAfterTax(Vehicle vehicle) {
        double priceBeforeTax = vehicle.getPrice();
        double priceAfterTax = priceBeforeTax + (priceBeforeTax * vehicle.getTaxt_amt());
        return (float) priceAfterTax;


    }
}