package chapterSeventeen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List <Worker> workers = new ArrayList<>();

        Worker funmi = new Worker("funmi", 34);
        Worker ameerah = new Worker("ameerah", 18);
        Worker adeola = new Worker("adeola", 23);
        Worker increase = new Worker("increase", 40);

        workers.add(funmi);
        workers.add(ameerah);
        workers.add(adeola);
        workers.add(increase);

        Collections.sort(workers, new Comparator<Worker>() {
            @Override
            public int compare(Worker worker1, Worker worker2) {
                return worker1.getName().compareTo(worker2.getName());
            }
        });
        for (var worker:
             workers) {
            System.out.println(worker.getName());
        }
    }
}
class Worker{
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}