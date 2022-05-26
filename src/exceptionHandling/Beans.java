package exceptionHandling;

public class Beans {
    private int numberOfSpoons;
    private boolean withOmiEwa;


    public Beans(int amount, boolean withOmiEwa) {
        this.numberOfSpoons = amount/50;
        this.withOmiEwa = withOmiEwa;
    }

    @Override
    public String toString() {
        return String.format("%d spoons of beans %s", numberOfSpoons, withOmiEwa, "?");
    }
}
