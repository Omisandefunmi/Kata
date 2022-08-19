package chapterNine.inheritance;

public class Train extends Vehicle{
    private String stationLocation;

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }
    @Override
    public String move(){
        return "Excess load on top train";
    }
}
