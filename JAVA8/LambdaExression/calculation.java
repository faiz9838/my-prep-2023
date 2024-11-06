package JAVA8.LambdaExression;

interface addition {
    public void add();
}

interface subtraction {
    public void sub();
}

public class calculation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        addition add1 = () -> {
            System.out.println("Addition is: " + (a + b));
        };

        add1.add();

        subtraction sub1 = () -> {
            System.out.println("Subtraction is: " + (b - a));
        };

        sub1.sub();
    }
}
