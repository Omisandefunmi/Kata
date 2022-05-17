package dsa;

import interfaces.ArrayList;

public class Stack {
    private ArrayList arrayList;
    private int counter;
    private String[] elements = new String[5];
    public boolean isEmpty() {
        if (counter == 0)
            return true;
        else
            return false;
    }

    public void push(String element) {
        elements[counter] = element;
        counter++;

    }

    public void pop() {
        elements[0] = null;
        counter--;
        for (int i = 0; i < size(); i++) {
            elements[i] = elements[i + 1];

        }


    }

    public String peek() {
        return elements[counter-1];

    }

    public int size() {
        return counter;
    }

    public String peek(int index) {
        return elements[index-1];
    }


}
