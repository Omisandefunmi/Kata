package chapter3;

public class A {
        protected void doSmth() {
            System.out.println("Do smth A");
        }
        protected void doSmthElse() {
            System.out.println("Do smth else A");
        }

    }
    class B extends A {
        protected void doSmth() {
            System.out.println("Do smth B");
        }
        protected void doSmthElse(int i){
            System.out.println("Do smth else B");
        }

}
