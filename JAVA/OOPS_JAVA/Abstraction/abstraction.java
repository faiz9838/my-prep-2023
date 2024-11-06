package JAVA.OOPS_JAVA.Abstraction;

abstract class company {
    public abstract void work();

    public abstract void service();

    public abstract void salary();
}

class employee extends company {
    public void work() {
        System.out.println("All employees work for comapny");
    }

    public void service() {
        System.out.println("This companies provide a good services ");
    }

    public void salary() {
        System.out.println("This companies are also give salary to thier employee");
    }
}

public class abstraction {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.work();
        e1.salary();
        e1.service();
    }
}
