package JAVA8.FunctionalInterface;

@FunctionalInterface
interface functionalInterface {
    void say(String msg);
}

public class example1 implements functionalInterface {
    public static void main(String[] args) {
        example1 fi = new example1();
        fi.say("Functional Interface");
    }

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

}