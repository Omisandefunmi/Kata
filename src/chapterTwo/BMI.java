package chapterTwo;

public class BMI {

    private double weight;
    private double height;

    public void setWeight(double weight1) {
        if (weight1 > 0)
        weight = weight1;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        if(height > 0)
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calculateBMIForWeightInKG() {
        return weight /(height * height);
    }

    public double calculateBMIForWeightInPounds() {
        int conversionConstant = 703;
        return (weight * conversionConstant)/ (height * height);
    }


}
