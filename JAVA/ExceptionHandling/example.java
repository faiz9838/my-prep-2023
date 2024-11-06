package JAVA.ExceptionHandling;

public class example {
    public static void main(String[] args) {
        int a = 60, b = 0;

        System.out.println("Started......");
        int result = a / b;
        System.out.println("Division is: " + result);
        System.out.println("Terminated....");

    }
}

/*
 * try{
 * number of line code // possiblity to occur error
 * }
 * catch(Exception e){
 * //handling code
 * }
 * throw{
 * print the exception class
 * }
 * finally {
 * print after exception handling done
 * }
 * 
 */