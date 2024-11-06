package CLASS_OBJECT;

class person {

    // WHEN WE USE STATIC KEYORD IN ANY METHOD OR DATA MEMBER THEY ARE ACCESS
    // WITHOUT ANY OBJECT CRAETION

    // WE CAN ACCESS ATTRIBUTES OR METHOD THROW CLASS DIRECTLY WHEN STATIC KEYWORD
    // USE
    public static String name;
    public static int age;

    public static void show() {
        name = "Faiz Ahmad";
        age = 20;

        System.out.println("Name is " + name + " and " + "age is " + age);
    }
}

public class staticMethodClass {
    public static void main(String[] args) {
        person.show();
    }
}
