package chapterSeven;

import java.util.ArrayList;

public class Diary {


    private String userName;
    private int noOfEntries ;
    private String password;
    private final ArrayList <Entry> entries;
    
    


    public Diary(String username, String password){
        this.password = password;
        this.userName = username;
        entries = new ArrayList<>();

    }
    public String findEntryBy(int entryId, String password){
        int index = entryId - 1;
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if(i == index && getPassword().equals(password)){
                return entry.getTitle()+ " || "+ entry.getBody()+ " || "+entry.getDate();
            }
        }
        return "Entry "+entryId+ " not found!";
    }
    public int getNoOfEntries() {
        return noOfEntries;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    private boolean validatePassword(String password){
        return getPassword().equalsIgnoreCase(password);

    }

    public void write(String title, String body, String password) {
        noOfEntries++;

        boolean isValid = validatePassword(password);
        if(!isValid){
            throw new IllegalArgumentException("Invalid password");
        }

        Entry entry = new Entry(title, body);
        entries.add(entry);



    }


    public void deleteEntryBy(int entryNumber, String password) {
       int index = entryNumber - 1;
       entries.remove(index);
       noOfEntries--;
    }


    public boolean lockDiary(String password) {
        boolean isLock = getPassword().equals(password);
        if(!isLock) {
//            throw new IllegalArgumentException("Wrong password!!! Diary not locked");
            System.out.println("Wrong password!!! Diary not locked");
            return false;
        }
        else {
            System.out.println("Diary successfully locked");
            return true;
        }


    }

    public boolean unlockDiary(String password) {
        boolean unlock = getPassword().equals(password);
        if (!unlock){
//            throw new IllegalArgumentException("Wrong password!!! Diary still locked!!!");
            System.out.println("Wrong password!!! Diary still locked!!!");
            return false;

        }

        else {
            System.out.println("Unlock successful!!!");
            return true;
        }
    }


    public void printDiary() {
        for (int i = 0; i < entries.size(); i++) {
            System.out.println("Entry "+(i+1)+ " contains "+entries.get(i));
        }

    }

    public void deleteEntryByTitle(String entryTitle, String password) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if(entry.getTitle().equals(entryTitle) && getPassword().equals(password)){
                entries.remove(entry);
                noOfEntries--;
            }
        }
    }

    public void editEntry(int entryId, String newTitle, String newBody, String name, String password) {
        int index = entryId - 1;
        for (int i = 0; i < entries.size(); i++) {

            if (i == index && getUserName().equals(name) && getPassword().equals(password)) {
                Entry entry = new Entry(newTitle, newBody);
                entries.set(i, entry);
            }
        }
    }
}

