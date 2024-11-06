package JAVA.Packages.Employee;

import JAVA.Packages.Company.company;

public class employee {
    private int emp_id;
    private int emp_salary;
    private String emp_name;

    public employee(int emp_id, int emp_salary, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;

    }

    public void show() {
        System.out.println("Employee id: " + emp_id);
        System.out.println("Employee name: " + emp_name);
        System.out.println("Employee salary: " + emp_salary);

    }
}
