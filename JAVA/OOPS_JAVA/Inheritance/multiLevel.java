package Inheritance;

class base {
    public void display() {
        System.out.println("This base class");
    }
}

class derived1 extends base {
    @Override
    public void display() {
        super.display();
        System.out.println("This is derived 1");
    }
}

class derived2 extends derived1 {
    @Override
    public void display() {
        super.display();
        System.out.println("This is derived 2");
    }

}

public class multiLevel {
    public static void main(String[] args) {
        derived2 d1 = new derived2();
        d1.display();
    }
}
