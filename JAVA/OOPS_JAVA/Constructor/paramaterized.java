package Constructor;

class student {
    int id;
    String name;
    String Class;

    public student(int id, String name, String Class) {
        this.Class = Class;
        this.id = id;
        this.name = name;
    }

    public void studentInfo() {
        System.out.println("Student id : " + this.id);
        System.out.println("Student name is : " + this.name);
        System.out.println("Student Class : " + this.Class);
    }
}

public class paramaterized {
    public static void main(String[] args) {
        student stud1 = new student(1, "Faiz Ahmad", "TY BSC");
        stud1.studentInfo();

        student stud2 = new student(2, "Talha Khan", "TY BSC");
        stud2.studentInfo();
    }
}
