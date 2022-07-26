package chapter3;

public class HeartRateMonitor {
    private String firstName;
    private String lastName;


    public HeartRateMonitor(String firstName, String lastName, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        dateOfBirth = new DateOfBirth(year, month, day);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private DateOfBirth dateOfBirth;
}
