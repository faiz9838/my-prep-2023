package Constructor;

class constructor {

    public void name() {
        System.out.println("This is constructor class....");
    }

}

public class defaultConstructor {
    public static void main(String[] args) {
        constructor cons = new constructor();
        // This is default constructor when we create object of class there are
        // one default constructor present always
        cons.age = 19;
        cons.name();
        System.out.println("Age is : " + cons.age);
    }
}
