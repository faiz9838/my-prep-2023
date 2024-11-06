package JAVA8.LambdaExression;

interface hello {
    public void print();
}

public class helloWorld {
    public static void main(String[] args) {
        hello h1 = () -> {
            System.out.println("Faiz Ahmad");
        };

        h1.print();
    }

}
