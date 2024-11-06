package CLASS_OBJECT;

public class classMethod {

    public void addition(int a, int b) {
        System.out.println("Addition is : " + (a + b));
    }

    public static void main(String[] args) {
        // Create object and call the method of class
        classMethod add = new classMethod();
        add.addition(20, 10);
    }
}