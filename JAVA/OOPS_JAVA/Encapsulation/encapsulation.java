package JAVA.OOPS_JAVA.Encapsulation;

class employee {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setName("Faiz");
        e1.setSalary(60000);

        System.out.println("Name : " + e1.getName() + "\nSalary is : " + e1.getSalary());
    }
}
