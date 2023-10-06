package vehiculos;
// flyable class implementing the afalyable interface
public class FlyingCar implements Flyable{

    private int passengerCapacity;
    // constructor to set passenger capacity during object creation
    public FlyingCar(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }


    // implementation of transportaPassengers() method from flyable interface
    @Override
    public boolean transportsPassengers() {
        return false;
    }

    // getters and setters
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }




}
