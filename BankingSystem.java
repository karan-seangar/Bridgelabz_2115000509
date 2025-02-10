abstract class BankAccount{
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getHolderName(){
        return holderName;
    }

    public void setHolderName(String holderName){
        this.holderName = holderName;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    abstract double calculateInterest();

    public void displayDetails(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + holderName);
        System.out.println("Balance : " + balance);
    }
}

interface Loanable{

    boolean applyForLoan(double loanAmount);

    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable{
    private double interestRate;

    public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate){
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest(){
        return (getBalance() * interestRate) / 100;
    }

    @Override
    public boolean applyForLoan(double loanAmount){
        double maximumLoanLimit = calculateLoanEligibility();
        if(loanAmount <= maximumLoanLimit){
            System.out.println("Loan applied successfully");
            return true;
        }
        else{
            System.out.println("Loan amount exceeds the maximum limit");
            return false;
        }
    }

    @Override
    public double calculateLoanEligibility(){
        return getBalance() * 2;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Interest Rate : " + interestRate);
        System.out.println("Interested Amount : " + calculateInterest());
        System.out.println();
    }

}

class CurrentAccount extends BankAccount implements Loanable{
    private double interestRate;

    public CurrentAccount(int accountNumber, String holderName, double balance, double interestRate){
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest(){
        return (getBalance() * interestRate) / 100;
    }

    @Override
    public boolean applyForLoan(double loanAmount){
        double maximumLoanLimit = calculateLoanEligibility();
        if(loanAmount <= maximumLoanLimit){
            System.out.println("Loan applied successfully");
            return true;
        }
        else{
            System.out.println("Loan amount exceeds the maximum limit");
            return false;
        }
    }

    @Override
    public double calculateLoanEligibility(){
        return getBalance() * 3;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Interest Rate : " + interestRate);
        System.out.println("Interested Amount : " + calculateInterest());
        System.out.println();
    }
}

public class BankingSystem{
    public static void main(String []args){
        BankAccount savingsAccount = new SavingsAccount(12345, "Amit Kumar", 50000, 4);
        BankAccount currentAccount = new CurrentAccount(54321, "Mohit", 100000, 3);

        System.out.println("Savings Account Details : ");
        savingsAccount.displayDetails();

        System.out.println("Current Account Details : ");
        currentAccount.displayDetails();
    }
}
