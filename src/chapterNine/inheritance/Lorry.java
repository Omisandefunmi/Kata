package chapterNine.inheritance;

public class Lorry extends Vehicle{
    private String lorryCapacity;

    public String getLorryYear() {
        return lorryYear;
    }

    public void setLorryYear(String lorryYear) {
        this.lorryYear = lorryYear;
    }

    private String lorryYear;

    public String getLorryCapacity() {
        return lorryCapacity;
    }

    public void setLorryCapacity(String lorryCapacity) {
        this.lorryCapacity = lorryCapacity;
    }
    @Override
    public String move(){
        return "hustling lorry";
    }
}
