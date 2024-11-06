package JAVA8.LambdaExression;

interface singlePara {
    public String say(String name);
}

interface mutltiplePara {
    public int add(int a, int b);
}

public class typesOfUse {
    public static void main(String[] args) {
        singlePara s1 = (name) -> {
            return "Hello " + name;
        };

        System.out.println(s1.say("Faiz Ahmad"));

        mutltiplePara p1 = (a, b) -> {
            return (a + b);
        };

        System.out.println("Addition is: " + p1.add(100, 20));
    }

}
