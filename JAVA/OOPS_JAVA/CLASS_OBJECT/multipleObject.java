package CLASS_OBJECT;

class animal {
    public void run() {
        System.out.println("I am Running....");
    }
}

public class multipleObject {
    public static void main(String[] args) {
        animal cat = new animal();
        System.out.println("cat object  \n" + cat);
        cat.run();

        animal dog = new animal();

        // COPY OBJECT TO ANOTHER OBJECT THEY STORE AT SAME ADDRESS IN HEAP
        dog = cat;
        System.out.println("dog object  \n" + dog);
        dog.run();

        // CREATE MULTIPLE OBJECT USING CLASS ANIMAL OR OTHER OBJECT

        animal sheep = new animal();
        animal fox = new animal();
        animal cow = new animal();
        animal goat = new animal();

    }
}
