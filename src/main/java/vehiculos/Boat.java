package vehiculos;

public class Boat extends Vehicle implements Driveable{
// ivar
    private boolean hasGps;
    public Boat(String name, boolean hasGps) {
        super(name);
        this.hasGps = hasGps;
    }

    public void printGpsInfo(){
        if (hasGps){
            System.out.println(getName() + " has GPS");
        }else {
            System.out.println(getName()+ "does not have GPS");
        }
    }
}




