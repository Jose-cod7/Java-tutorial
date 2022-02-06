package chapter9.cakecake;

public class BirthdayCake extends Cake {
    private String candles;


    public BirthdayCake() {
        super("Chocolate and Peanut butter");
        System.out.println("This is the default BDAY Cake constructor!");
    }

    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }
}
