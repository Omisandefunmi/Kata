package dsa;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkedListDemo {
    public static void main(String[] args) {
        LinkedList <String> states = new LinkedList<>();
        states.add("Lagos");
        states.add("Abuja");
        states.add("Rivers");
        states.add("Oyo");
        states.add("Ogun");

        printList(states);
        System.out.println();
        states.add(1, "Bayelsa");
        printList(states);




    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator <String> i = linkedList.iterator();
        while(i.hasNext()){

            System.out.println(i.next() +" is a state in Nigeria");
        }
    }
}
