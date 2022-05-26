package personalOOPPractice.Telephone;

public class MobilePhone implements Telephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone turned on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now calling "+phoneNumber+" on mobile phone");
        }
    }
    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Melody ring ");
        } else{
            System.out.println("Phone is switched off");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
