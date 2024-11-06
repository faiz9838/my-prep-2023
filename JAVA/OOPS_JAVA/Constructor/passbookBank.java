package Constructor;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    protected float totalAmount = 0;
    protected float withdraw;
    protected String AccountHolderName;
    protected String IFCS;
    protected String Date;
    protected long accountNumber;
    protected float deposit;

    protected Account(float totalAmount, String AccountHolderName, String IFCS,
            String Date,
            long accountNumber) {
        this.totalAmount = totalAmount;
        this.AccountHolderName = AccountHolderName;
        this.IFCS = IFCS;
        this.Date = Date;
        this.accountNumber = accountNumber;
    }

}

class passbook extends Account {

    protected passbook(float totalAmount, String AccountHolderName, String IFCS,
            String Date, long accountNumber) {
        super(totalAmount, AccountHolderName, IFCS, Date, accountNumber);

        this.AccountHolderName = AccountHolderName;
        this.IFCS = IFCS;
        this.Date = Date;
        this.accountNumber = accountNumber;

    }

    public int withdraw(int WithdrawAmount) {
        float withdrawAmount = 0;
        if (withdrawAmount == 0) {
            return 0;
        }
        withdrawAmount = totalAmount - WithdrawAmount;
        return (int) withdrawAmount;
    }

    public int deposit(int DepositAmount) {
        float depositAmount = 0;
        depositAmount = totalAmount + DepositAmount;
        return (int) depositAmount;
    }

    public void statement() {

        System.out.println("Account number : " + this.accountNumber);
        System.out.println("Account Holder name : " + this.AccountHolderName);
        System.out.println("IFCS Code : " + this.IFCS);
        System.out.println("Date : " + this.Date);
        System.out.println("Toatal Amount = " + totalAmount);

    }

}

public class passbookBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        passbook p1 = new passbook(100000, "Faiz Ahmad", "BKC0123", "12/12/24", 122273637);

        System.out.println("X---------------- YOUR PASSBOOK ------------------X");
        System.out.println();
        p1.statement();
        System.out.println("Deposit amount : " + p1.deposit(45000));
        System.out.println("Withdraw amount : " + p1.withdraw(0));

    }
}
