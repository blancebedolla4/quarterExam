package vehiculos;

public abstract class Product {
    // variables
    private String name;

    // constructor
    public Product (String name){
        this.name = name;
    }
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
