package Inheritance;

class base {
    public void display() {
        System.out.println("This is base class");
    }
}

class derivedClass1 extends base {
    public void display() {
        super.display();
        System.out.println("This is derived class 1");
    }
}

class derivedClass2 extends base {
    public void display() {
        super.display();
        System.out.println("This is derived class 2");
    }
}

public class heirarichal {
    public static void main(String[] args) {
        derivedClass1 de1 = new derivedClass1();
        de1.display();
        System.out.println("--------------------");
        derivedClass2 de2 = new derivedClass2();
        de2.display();
    }
}
