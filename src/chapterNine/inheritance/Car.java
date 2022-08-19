package chapterNine.inheritance;

public class Car extends Vehicle {
    private String carModel;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
//    @Override
//    public String move(){
//     return "Cruising as a car";
//    }

}
