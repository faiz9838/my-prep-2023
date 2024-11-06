package CLASS_OBJECT;

class car {
    public void show() {
        System.out.println("This is car class");
    }
}

class superCar {

    public void show() {
        System.out.println("This is super car class");
    }
}

public class multipleClass {
    public static void main(String[] args) {
        car c1 = new car();
        c1.show();

        superCar c2 = new superCar();
        c2.show();
    }

}
