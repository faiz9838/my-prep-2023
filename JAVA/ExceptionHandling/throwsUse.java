package JAVA.ExceptionHandling;

public class throwsUse {

    public static void show() throws Exception {
        try {
            throw new Exception("USING THROWS");
        } catch (Exception e) {
            System.out.println("Inside show method().");
            throw e;
        }
    }

    public static void main(String[] args) throws Exception {
        show();
    }
}
