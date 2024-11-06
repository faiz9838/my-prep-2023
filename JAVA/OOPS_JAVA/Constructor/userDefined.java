package Constructor;

class test {
    public void method() {
        System.out.println("This is user defined construtor code....");
    }

    // THIS IS USER DEFINED CONSTRUCTOR
    public test() {

    }
}

public class userDefined {
    public static void main(String[] args) {
        test t = new test();
        t.method();
    }
}
