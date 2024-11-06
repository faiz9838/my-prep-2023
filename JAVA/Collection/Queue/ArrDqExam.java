package JAVA.Collection.Queue;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

class batch {
    String name;
    int noOfStudents;

    batch(String name, int noOfStudents) {
        this.name = name;
        this.noOfStudents = noOfStudents;
    }
}

public class ArrDqExam {
    public static void main(String[] args) {
        ArrayDeque<batch> list = new ArrayDeque<>();
        list.add(new batch("IT", 50));
        list.add(new batch("BCOM", 70));

        list.forEach((value) -> print(value));
    }

    public static void print(batch n) {
        System.out.println("*******************************");
        System.out.println("Batch Name is : " + n.name);
        System.out.println("No of students: " + n.noOfStudents);
    }
}
