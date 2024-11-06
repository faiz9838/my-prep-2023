package Inheritance;

interface one {
    public void one();
}

interface two {
    public void two();

}

class three implements one, two {
    public void display() {
        System.out.println("This is derived class");
    }

    @Override
    public void one() {

        System.out.println("This is interface one");
    }

    @Override
    public void two() {

        System.out.println("This is interface two");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        three der = new three();
        der.display();
        der.one();
        der.two();
    }
}
