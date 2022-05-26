package dsa;

import java.util.ArrayList;

public class HashMapAgain {
    private int numberOfEntries;
    private ArrayList <String> keys = new ArrayList<>();
    private ArrayList <String> values = new ArrayList<>();
    public void put(String key, String value) {
        if (!keys.contains(key)) {
            keys.add(numberOfEntries, key);
            values.add(numberOfEntries, value);
            numberOfEntries++;
        }
        else{
            replace(key, value);
        }
    }



    public int size() {
        return numberOfEntries;
    }

    public String get(String key) {
        int indexOfKey = getIndexOf(key);
        return values.get(indexOfKey);
    }

    public String getByValue(String value) {
        int indexOfValue = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if(keys.get(i).equals(value)){
                indexOfValue = i;
            }
        }
        return keys.get(indexOfValue);
    }

    public boolean containsKey(String key) {
        for (int i = 0; i < numberOfEntries; i++) {
            if(keys.get(i).equals(key)){ return true;}
        }
        return false;
    }

    public void replace(String key, String oldValue, String newValue) {
        int valueIndex = getIndexOf(key);
        if(containsValue(oldValue)){
            values.set(valueIndex, newValue);
        }
    }

    private boolean containsValue(String value) {
        for (int i = 0; i < numberOfEntries; i++) {
            if(values.get(i).equals(value)){ return true;}
        }
        return false;
    }

    private int getIndexOf(String key) {
        int indexOfKey = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if(keys.get(i).equals(key)){
                indexOfKey = i;
                break;
            }
        }
        return indexOfKey;
    }

    public void replace(String key, String value) {
        int valueIndex = getIndexOf(key);
            values.set(valueIndex, value);
        }

}
