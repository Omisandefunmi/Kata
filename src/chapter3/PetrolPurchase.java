package chapter3;

public class PetrolPurchase {
    private String stationLocation;
    private PetrolType petrolType;
    private int petrolQuantity;
    private double petrolPrice;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, PetrolType petrolType,
                          int petrolQuantity, double petrolPrice, double percentageDiscount) {
        this.petrolPrice = petrolPrice;
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.petrolQuantity = petrolQuantity;

        this.percentageDiscount = percentageDiscount/100;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setPetrolType(PetrolType petrolType) {
        this.petrolType = petrolType;
    }

    public PetrolType getPetrolType() {
        return petrolType;
    }

    public void setPetrolQuantity(int petrolQuantity) {
        if (petrolQuantity >= 1)
        this.petrolQuantity = petrolQuantity;
    }


    public int getPetrolQuantity() {
        return petrolQuantity;
    }

    public void setPetrolPrice(double petrolPrice) {
        if (petrolPrice > 0)
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

    public double getPurchaseAmount() {
        double discountAmount = petrolPrice * petrolQuantity * percentageDiscount;
        double netAmount = petrolPrice * petrolQuantity - discountAmount;
        return netAmount;
    }
}
