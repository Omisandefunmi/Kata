package dsa;

import java.util.Arrays;

public class Queue {
    private boolean isEmpty = true;
    private int counter;
    private int numberOfPopped;
    private boolean isLastIndexOccupied;
    private int filledIndices;

    private String[] elements = new String[5];
    private boolean indexZeroIsNull;
    public boolean isEmpty() {
        return isEmpty;
    }

    public int size() {
        filledIndices = counter - numberOfPopped;
        return filledIndices;
    }

    public void push(String element) {
        if(numberOfPopped > 0){
            isLastIndexOccupied();
            if(!isLastIndexOccupied){
                implementPush(element);
            }
            else{
                refillAllNullIndices();
                implementPush(element);
            }
        }
        else {implementPush(element);}
    }

    private void implementPush(String element) {
        elements[counter] = element;
        counter++;
    }


    public String peek() {
        return elements[counter - 1];
    }

    public String peek(int index) {
        return elements[index - 1];
    }

    public String pop() {
        String popped = "";
        isIndexZeroIsNull();
        if (indexZeroIsNull) {
            popped = findNextFilledElement_PopIt(popped);
        } else {
            popped = popElementAtIndexZero();
        }
            return popped;
        }

    private String popElementAtIndexZero() {
        String popped;
        popped = elements[0];
        elements[0] = null;
        numberOfPopped++;
        return popped;
    }

    private String findNextFilledElement_PopIt(String popped) {
        for (int i = 0; i < counter; i++) {
            if (elements[i] != null) {
                popped = elements[i];
                elements[i] = null;
                numberOfPopped++;
                break;
            }
        }
        return popped;
    }

    private boolean isLastIndexOccupied(){
        if(elements[elements.length - 1] != null){return isLastIndexOccupied = true;}
        else {return isLastIndexOccupied = false;}
    }

    private boolean isIndexZeroIsNull(){
        if (elements[0] == null){ return indexZeroIsNull = true;}
        else return indexZeroIsNull = false;
    }

    private void refillAllNullIndices() {
        int arrayIndex = 0;
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] != null) {
                elements[arrayIndex] = elements[i];
                arrayIndex++;
            }
        }
        counter = counter-numberOfPopped;
        numberOfPopped = 0;
    }

    public void display(){
        System.out.println(Arrays.toString(elements));
    }
}




