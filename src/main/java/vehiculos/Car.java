package vehiculos;

public class Car extends Vehicle implements Driveable{
    private int numberOfDoors;
    private float extraTax =0.5f;

    public Car(String name, int numberOfDoors) {
        super(name);
        this.numberOfDoors = numberOfDoors;
    }
    // methos to print number of doors
    public void printNumberOfDoors(){
        System.out.println(" Number of doors:" + numberOfDoors);
    }
}
