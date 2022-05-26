package turtle;

public class Pen {
    public boolean isDown;
    //    private Position penPosition;
//
    private boolean isUp;
//    public void penPosition() {
//
//    }

//    public void penDown() {
//        isUp = false;
//    }

    public boolean isDown() {
        return !isUp;
    }

    public void penUp(){
        isDown = false;
    }
}
