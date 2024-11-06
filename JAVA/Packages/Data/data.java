package JAVA.Packages.Data;

import JAVA.Packages.Employee.employee;
import JAVA.Packages.Company.company;

public class data {
    public static void main(String[] args) {
        company c1 = new company(1233, 4332, "Amazon");
        company c2 = new company(23413, 4256, "Flipkart");

        employee employee_1 = new employee(100, 45000, "Talha Khan");

        System.out.println("x------------ COMPANY DATA ----------X");
        c1.show();
        c2.show();
        System.out.println("x------------ EMPLOYEE DATA ----------X");
        employee_1.show();
    }
}
