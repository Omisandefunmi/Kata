package personalOOPPractice.Telephone;

public class LandLine implements Telephone{
    private int myNumber;
    private boolean isRinging;

    public LandLine(int phoneNumber) {

    }


    @Override
    public void powerOn() {
        System.out.println("No action taken, land line has no power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now calling "+phoneNumber+ "on land line");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the land line");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        }
        else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
