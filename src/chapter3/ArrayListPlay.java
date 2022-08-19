package chapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPlay {
    public static void main(String[] args) {
        ArrayList <Integer> samp = new ArrayList<>();
        samp.add(1);
        samp.add(1);
        samp.add(2);
        samp.add(1);

        ArrayList sample = new ArrayList<>();
        sample = (ArrayList)samp.clone();
        ArrayList<Integer> samp2 = new ArrayList<>(samp);
        System.out.println(samp.hashCode());
        System.out.println(sample.hashCode());
        System.out.println(samp2.hashCode());
    }
}
