package chapterfourteen;

    class Node<T>{
        private T data;
        private Node <T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }

        public boolean addNext(Node <T> node){
            next = node;
            return true;
        }

        public Node<T> next(){
            return next;
        }

        public T getData(){
            return data;
        }

        public void setData(T data){
            this.data = data;
        }
    }
public class SinglyLinkedList<T> {
        private int size;
        private Node<T> head;

    public SinglyLinkedList(){
        head = null;
        size = 0;
    }

    public SinglyLinkedList(T data){
        this.head = new Node<T>(data);
        this.size++;
    }

    public Node<T> getHead(){
        return head;
    }

    public void insert(T data){
        Node<T> newNode = new Node<>(data);

        Node <T> current = head;
        while(current.next() != null){
            current = current.next();
        }
        current.addNext(newNode);
        size++;
    }

    public void insert(T data, int position){
        if(position < 0 || position > size){
            throw new IllegalArgumentException(String.format("Position %d can not be less than zero or greater than size", position));
        }
        Node<T> newNode = new Node<>(data);
        int count = 0;

        Node<T> current = head;
        while(count < position){
            current = current.next();
            count++;
        }
        Node<T> temp = current.next();
        current.addNext(newNode);
        newNode.addNext(temp);
    }

    public void delete(){
        if(head.next() == null){
            head = null;
        }
        Node<T> current = head;
        while(current.next().next().equals(null)){

        }
    }
}



