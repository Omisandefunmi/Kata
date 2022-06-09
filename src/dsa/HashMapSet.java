package dsa;

import interfaces.ArrayList;

public class HashMapSet {

    private int numberOfEntries;
    private final SetPractice keys = new SetPractice();
    private final ArrayList values = new ArrayList();

    public int size() {
        return numberOfEntries;
    }

    public void put(String key, String value) {
        keys.add(key);
        values.add(value);
        numberOfEntries++;
    }

    public boolean containsKey(String key) {
        for (int i = 1; i <= numberOfEntries; i++) {
            if(keys.get(i).equals(key)){return true;}
        }
        return false;
    }

    public String get(String key) {
        int valueIndex = getIndexOf(key);
        return values.get(valueIndex);
    }

    private int getIndexOf(String key) {
        int valueIndex = 0;
        for (int i = 0; i < size(); i++) {
            if(keys.contains(key)){ valueIndex = i; break; }
        }
        return valueIndex;
    }
}
