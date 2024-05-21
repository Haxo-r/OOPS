package Artstop;

public class PhysicalResources extends Resources {

    double weight;

    public PhysicalResources(int id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void addToCart(int ID) {

    }

    @Override
    public void display() {
        System.out.printf("Product id: %d\n" +
                "Name: %s\n" +
                "Price: %f\n" +
                "Weight: %f\n",getProduct_id(),getProduct_name(),getPrice(),getWeight());
    }
}
