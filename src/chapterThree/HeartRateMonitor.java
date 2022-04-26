package chapterThree;

import java.util.Objects;

public class HeartRateMonitor {
    private String firstName;
    private String secondName;
    private String name;

    public void setFirstName(String firstName) {
        if (!Objects.equals(firstName, ""))
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }


    public void setSecondName(String secondName) {
        if(!Objects.equals(secondName, ""))
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setName(String firstName, String secondName) {
        name = firstName +secondName;
    }

    public String getName() {
        return firstName +" "+secondName ;
    }
}
