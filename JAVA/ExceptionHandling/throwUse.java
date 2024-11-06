package JAVA.ExceptionHandling;

public class throwUse {

    public static void help() throws Exception {
        try {
            throw new Exception("Error unkown");
        } catch (Exception e) {
            System.out.println("Caught inside help().");

            throw e;
        }

    }

    public static void main(String[] args) {
        try {
            help();
        } catch (Exception e) {
            System.out.println("Caught in main error name given below");
            System.out.println(e);
        }
    }
}
