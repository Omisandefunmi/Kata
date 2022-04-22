package chapter3;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int petrolQuantity;
    private double petrolPrice;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType,
                          int petrolQuantity, double petrolPrice, int percentageDiscount) {
        this.petrolPrice = petrolPrice;
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.petrolQuantity = petrolQuantity;
        this.percentageDiscount = percentageDiscount;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolQuantity(int petrolQuantity) {
        this.petrolQuantity = petrolQuantity;
    }


    public int getPetrolQuantity() {
        return petrolQuantity;
    }

    public void setPetrolPrice(double petrolPrice) {
        this.petrolPrice = petrolPrice;
    }

    public double getPetrolPrice() {
        return petrolPrice;
    }

    public void setPercentageDiscount(double discount) {
        percentageDiscount = (discount/100);

    }

    public double getPercentageDiscount() {
        return percentageDiscount * 100;
    }
}
