package JAVA.OOPS_JAVA.Polymorphism.Overloading;

class methodOverloading {
    public void calculate(int a, int b) {
        System.out.println("Addition is : " + (a + b));
    }

    public void calculate(int a, int b, int c) {
        System.out.println("Subtraction is : " + ((a + b) - c));
    }
}

public class overloading {

    public static void main(String[] args) {
        methodOverloading m1 = new methodOverloading();
        m1.calculate(10, 20);
        m1.calculate(20, 20, 5);
    }
}
