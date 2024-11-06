package JAVA8.MethodRefreces;

interface sayHello {
    void say();
}

public class example1 {

    public static void saySomething() {
        System.out.println("Jhand life");
    }

    public static void main(String[] args) {
        sayHello obj = example1::saySomething;

        obj.say();
    }
}