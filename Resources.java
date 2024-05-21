package Artstop;

public abstract class Resources {

    private int product_id;
    private String product_name;
    private double price;

    public Resources(int product_id, String product_name, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public double getPrice() {
        return price;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.printf("Product id: %d\n" +
                "Name: %s\n" +
                "Price: %f\n" +getProduct_id(),getProduct_name(),getPrice());
    }

    public abstract 
}
