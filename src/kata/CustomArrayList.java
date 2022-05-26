package kata;

public class CustomArrayList {
    private int numberOfElements;
    private String [] elements = new String[5];

    public void add(String element) {
        verifyIfFullAndExpandArray();
        implementAdd(element);

    }



    public void add(int index, String element){
        String [] newElements = new String[elements.length +1];
        int actualIndex = index - 1;
        int elementIndex = 0;
        int loop = 0;
        while(loop < newElements.length){
            if(loop ==actualIndex){ elements[loop] = element; }
            else {newElements[loop] = elements[elementIndex]; elementIndex++;}
            loop++;
        }
        elements = newElements;
        numberOfElements++;
    }

    private void expandArray() {
        elements = new String[elements.length * 2];

    }

    public int size() {
        return numberOfElements;
    }

    public String get(int index) {
        int realIndex = index - 1;
        return elements[realIndex];
    }

    public String removeBy(int index) {
        int realIndex = index - 1;
        String removed = elements[realIndex];
        elements[realIndex] = null;
        numberOfElements--;
        fillInEmptyIndex(realIndex);
        return removed;
    }

    private void fillInEmptyIndex(int index) {
        if (numberOfElements - index >= 0)
            System.arraycopy(elements, index + 1, elements, index, numberOfElements - index);
    }

    private boolean isFull(){
        return numberOfElements == elements.length;
    }
    private void implementAdd(String element){
        elements[numberOfElements] = element;
        numberOfElements++;
    }
    private void verifyIfFullAndExpandArray() {
        if(isFull()){ expandArray(); }
    }

}
