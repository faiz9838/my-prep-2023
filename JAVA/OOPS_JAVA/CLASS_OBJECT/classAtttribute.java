package CLASS_OBJECT;

class person {
    // THIS IS ATTRIBUTE OF CLASS
    public String name;
    public int age;

}

public class classAtttribute {
    public static void main(String[] args) {
        person p1 = new person();
        p1.name = "Faiz Ahmad";
        p1.age = 20;

        System.out.println("Name is " + p1.name + " and " + "age is " + p1.age);
    }
}
