package dsa;
public class Queue {
    private int counter;
    private final String[] elements = new String[5];
    private int numberOfPoppedItems;

    public boolean isEmpty() {
        if (numberOfPoppedItems == counter)
            return true;
        else
            return false;
    }

    public void push(String element) {
        boolean isFull = counter == elements.length;
        boolean isNullIndexAvailable = elements[0] == null;
        if (isFull && isNullIndexAvailable){
            refillQueueFromIndexZero();
            implementAdd(element);
        }
            else if(!isFull) {implementAdd(element);}
            else{ throw new ArrayIndexOutOfBoundsException("Queue is full");
    }
    }



    public String pop() {
        int count = 0;
        String removed = "";
        boolean indexNotNull = elements[count] != null;
        while(count < size()){
        if(!indexNotNull){
            removed = removeElementAt(count);
            break;
        }
        else count++;
        }
        return removed;
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


    public int checkNumberOfPoppedItem() {
        return numberOfPoppedItems;
    }

    private void refillQueueFromIndexZero() {
        counter = 0;
        int index = 0;
        for (int i = 1; i < elements.length; i++) {
            if(elements[i] != null){
                elements[index] = elements[i];
                index++;
                counter++;
            }
        }
    }

    private void implementAdd(String element){
        elements[counter] = element;
        counter++;

    }

    private String removeElementAt(int count) {
        String removed;
        removed = elements[count];
        elements[count] = null;
        numberOfPoppedItems++;
        return removed;
    }

}
