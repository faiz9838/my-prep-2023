package JAVA.MINI_PROJECT;

class Bank {
    public static String Bankname;

    Bank(String Bankname) {
        this.Bankname = Bankname;
    }

    public String showName() {
        return Bankname;
    }
}

class contact extends Bank {
    public long phone_number;
    public String email;

    contact(long phone_number, String email) {
        super(Bankname);
        // TODO Auto-generated constructor stub
    }

}

class address extends contact {
    public String street;
    public String houseNumber;
    public String city;

    address(long phone_number, String email) {
        super(phone_number, email);
        this.houseNumber = houseNumber;
        this.city = city;
        this.street = street;
    }
}

class customer extends contact {

    public String firstname;
    public String lastname;

    customer(long phone_number, String email) {
        super(phone_number, email);
        this.firstname = firstname;
        this.lastname = lastname;
    }

}

public class bankSystem {
    public static void main(String[] args) {
        Bank b1 = new Bank("State of India");
        System.out.println(b1.showName());

    }
}
