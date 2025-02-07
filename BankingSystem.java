class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Account Type: Savings, Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Account Type: Checking, Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Account Type: Fixed Deposit, Deposit Term: " + depositTerm + " months");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 2000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000, 12);

        savings.displayInfo();
        System.out.println();
        checking.displayInfo();
        System.out.println();
        fixedDeposit.displayInfo();
    }
}
