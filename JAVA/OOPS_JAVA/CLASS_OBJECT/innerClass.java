package CLASS_OBJECT;

public class innerClass {

    // THIS IS INNER CLASS
    public class InnerClass {
        public void name() {
            System.out.println("This is inner class");
        }

    }
    // Inner Class object use by Method of outer class
    // public void innerObject() {
    // InnerinnerClass inner = new InnerinnerClass();
    // inner.name();
    // }

    public static void main(String[] args) {
        innerClass c = new innerClass();
        // Showing inner class class object output
        // c.innerObject();

        // INNER CLASS ACCESS BY HELP OF OUTER CLASS
        innerClass.InnerClass inner = c.new InnerClass();
        inner.name();

    }

}
