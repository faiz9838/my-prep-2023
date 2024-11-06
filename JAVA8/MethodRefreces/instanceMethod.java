package JAVA8.MethodRefreces;

interface sayHello {
    void say();
}

public class instanceMethod {

    public void saySomething() {
        System.out.println("This is non static method");
    }

    public static void main(String[] args) {
        instanceMethod obj = new instanceMethod();
        sayHello say = obj::saySomething;

        say.say();
    }
}
