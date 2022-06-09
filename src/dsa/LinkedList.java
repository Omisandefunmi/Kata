package dsa;

import interfaces.List;

public class LinkedList implements List {
    private int countNodes;
    private Node nodeHead;
    private Node nodeTail;

    static class Node {
        private String item;
        private Node nextNode;
        public Node(String item) {
            this.item = item;
            nextNode = null;
        }
    }

    @Override
    public void add(String item) {
        Node newNode = new Node(item);
        if(nodeHead == null){ nodeHead = newNode; nodeTail = newNode;}
        else{nodeTail.nextNode = newNode; nodeTail = newNode;}

    }

    @Override
    public void add(int index, String item) {

    }

    @Override
    public String get(int index) {
        int count = 1;
        String item = " ";
        Node node = nodeHead;
        while(node != null){
            if(count == (index)){
                break;}
            else{node = node.nextNode;
             item = node.item;}
        }
        return item;
    }

    @Override
    public void remove(String item) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        int counter = 0;
        Node node = nodeHead;
        while(node  != null){
            counter++;
            node = node.nextNode;
        }
        return counter;
    }

    @Override
    public void replace(int index, String item) {

    }
}
