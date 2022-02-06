package chapter9.cakecake;

public class WeedingCake extends Cake {

    private String tiers;

    public WeedingCake() {
        super("Cacao with gold leaves");
        System.out.println("This is the default Weeding Cake constructor!");
    }

    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }

}
