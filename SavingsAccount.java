public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("123456789", "Alice", 5000.0);
        myAccount.displayInfo();
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        System.out.println("Balance: " + myAccount.getBalance());
        myAccount.setBalance(7000.0);
        System.out.println("Updated Balance: " + myAccount.getBalance());
    }
}
