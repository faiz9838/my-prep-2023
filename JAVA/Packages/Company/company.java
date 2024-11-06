package JAVA.Packages.Company;

public class company {
    private int company_id;
    private int register_number;
    public String Company_Name;

    public company(int company_id, int register_number, String Company_Name) {
        this.company_id = company_id;
        this.register_number = register_number;
        this.Company_Name = Company_Name;
    }

    public void show() {
        System.out.println("Company id: " + company_id);
        System.out.println("Company register number: " + register_number);
        System.out.println("Company name: " + Company_Name);
    }

}
