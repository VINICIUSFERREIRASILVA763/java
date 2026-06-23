package entities;


public class Object {

    private String name;
    private double price;

    public Object (String name,double price){
        this.name = name;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
