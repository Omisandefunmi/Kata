package personalOOPPractice.Telephone;

public class PhoneMain {
    public static void main(String[] args) {

        Telephone myPhone;
        myPhone = new LandLine(12345);
        myPhone.powerOn();
        myPhone.callPhone(12345);
        myPhone.answer();

        Telephone ourPhone;
        ourPhone = new MobilePhone(54321);
        ourPhone.powerOn();
        ourPhone.isRinging();
        ourPhone.callPhone(54321);
        ourPhone.answer();




    }
}
