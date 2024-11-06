package JAVA.ArrayAsObject;

class student {
    int id;
    String name;
    String Class;
    String course;
}

public class students {
    public static void main(String[] args) {
        student students[] = new student[2];

        student s1 = new student();
        s1.id = 1;
        s1.name = "Faiz Ahmad";
        s1.Class = "TYBSCIT";
        s1.course = "JAVA";

        student s2 = new student();
        s2.id = 2;
        s2.name = "Tahoora Shaikh";
        s2.Class = "TYBSCIT";
        s2.course = "Cyber Security";

        students[0] = s1;
        students[1] = s2;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].id + "  " + students[i].name);
        }

    }
}