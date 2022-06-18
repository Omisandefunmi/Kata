package multiUserDiary;

import diary.Entry;

import java.util.ArrayList;

public class MultiUserDiary {
    private final String ownerName;
    private final ArrayList<Entry> entries;
    private String password;

    public MultiUserDiary(String username, String password) {
        this.password = password;
       ownerName = username;
        entries = new ArrayList<>();

    }

    public String findEntryById(int entryId, String password) {
        int index = entryId - 1;
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (i == index && getPassword().equals(password)) {
                return entry.getTitle().toUpperCase() + " || " + entry.getBody() + " || " + entry.getDate();
            }
        }
        return "Entry " + entryId + " not found!";
    }

    public int getNoOfEntries() {
        return entries.size();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean validatePassword(String password) {
        return getPassword().equals(password);

    }

    public void write(String title, String body) {
        Entry entry = new Entry(title, body);
        entries.add(entry);
    }


    public void deleteEntryBy(int entryNumber, String password) {
        int index = entryNumber - 1;
        if (index < 0 ){
            System.out.println("""
                    ERROR!!!
                    Entry Id too low!!!""");

        }
        else {
            if(index > entries.size()){
                System.out.println("""
                        ERROR!!!
                        Entry Id too high!!!""");
            }

            else {
                if (getPassword().equals(password)) {
                    entries.remove(index);
                    System.out.println("Entry "+entryNumber+ " deleted!!!");
                }
            }
        }
    }


    public boolean lockDiary(String password) {
        boolean isLock = getPassword().equals(password);
        if (!isLock) {
            System.out.println("Wrong password!!! Diary not locked");
            return false;
        } else {
            System.out.println("Diary successfully locked");
            return true;
        }


    }

    public boolean unlockDiary(String password) {
        boolean unlock = getPassword().equals(password);
        if (!unlock) {
            System.out.println("Wrong password!!! Diary still locked!!!");
            return false;

        } else {
            System.out.println("Unlock successful!!!");
            return true;
        }
    }


    public String printDiary() {
        if (entries.size() == 0) {
            System.out.println("Diary is empty.");
        }
        StringBuilder stringEntry = new StringBuilder();
        for (var entry: entries){
            stringEntry.append(entry);
        }

        return stringEntry.toString();

    }

    public void deleteEntryByTitle(String entryTitle, String password) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(entryTitle) && getPassword().equals(password)) {
                entries.remove(entry);
            }
        }
    }

    public void editEntry(int entryId, String newTitle, String newBody, String name, String password) {
        int index = entryId - 1;
        for (int i = 0; i < entries.size(); i++) {
            if (i == index && getOwnerName().equals(name) && getPassword().equals(password)) {
                Entry entry = new Entry(newTitle, newBody);
                entries.set(i, entry);
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder stringEntry = new StringBuilder();
        for (var entry: entries){
            stringEntry.append(entry);
        }

        return stringEntry.toString();
    }
}
