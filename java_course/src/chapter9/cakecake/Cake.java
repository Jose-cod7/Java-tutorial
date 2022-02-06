package chapter9.cakecake;

public class Cake {

    private String flavor;
    private double price;

    public Cake(String flavor){
        setFlavor(flavor);
        setPrice(27.56);
    }

    public Cake (double price){
        setPrice(price);
    }

    public String getFlavor() {
        return flavor;
    }

    /* public Cake (String flavor) {
        System.out.println("This is the Cake inherited constructor. Set flavor");
    } */

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
