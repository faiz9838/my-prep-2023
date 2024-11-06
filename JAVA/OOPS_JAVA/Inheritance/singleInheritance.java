package Inheritance;

class base {
    public void show() {
        System.out.println("This is base class");
    }

    base() {

    }
}

class derived extends base {

    @Override
    public void show() {

        super.show();
        System.out.println("This is derived class");
    }
}

public class singleInheritance {
    public static void main(String[] args) {

        derived d = new derived();

        d.show();

    }
}
