public class BankAccount {
    // Fields
    private String name;
    private int accountNumber;
    private double initialBalance;

    // Constructs a BankAccount with the given name, account number, 
    // and initial balance
    public BankAccount(String name, int accountNumber, double initialBalance) {
        /* implementation not shown */
    }

    // Returns the name of the account holder
    public String getName() {
        /* implementation not shown */
    }

    // Returns the account number
    public int getAccountNumber() {
        /* implementation not shown */
    }

    // Returns the current balance of the account
    public double getBalance() {
        /* implementation not shown */
    }

    // Deposits the given amount into the account. 
    // The amount must be positive.
    // Returns true if the deposit is successful, false otherwise.
    public boolean deposit(double amount) {
        /* to be implemented */
    }

    // Withdraws the given amount from the account. 
    // The amount must be positive and less than or equal to 
    // the current balance. 
    // Returns true if the withdrawal is successful, false otherwise.
    public boolean withdraw(double amount) {
        /* to be implemented */
    }

    // Transfers the given amount to another BankAccount. 
    // The transfer is only successful if this account has enough balance. 
    // Returns true if the transfer is successful, false otherwise.
    public boolean transfer(BankAccount other, double amount) {
        /* to be implemented */
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 12345, 
                                            1000.0);
        BankAccount acc2 = new BankAccount("Bob", 67890,
                                            500.0);

        
        System.out.println(acc1.deposit(200.0));         // true
        System.out.println(acc1.getBalance());                  // 1200.0

        System.out.println(acc1.withdraw(500.0));        // true
        System.out.println(acc1.getBalance());                  // 700.0

        System.out.println(acc1.transfer(acc2, 300.0));  // true
        System.out.println(acc1.getBalance());                  // 400.0
        System.out.println(acc2.getBalance());                  // 800.0

    }
}
