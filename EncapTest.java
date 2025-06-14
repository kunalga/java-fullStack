// Encapsulated class
class BankAccount {
    // 🔐 Data Hiding: private fields can't be accessed directly
    private String accountHolderName;
    private double balance;

    // ✅ Constructor: binds data when object is created
    public BankAccount(String name, double initialDeposit) {
        this.accountHolderName = name;
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            System.out.println("Invalid initial deposit!");
            this.balance = 0;
        }
    }

    // ✅ Getter: Controlled read access (providing security)
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // ✅ Setter: Controlled write access (providing security)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful.");
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }
}
public class EncapTest {
    public static void main(String[] args) {
        // ✅ Object Creation: Encapsulated object
        BankAccount account = new BankAccount("Alice", 1000.0);

        // ✅ Accessing data through methods
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        // ✅ Using setter methods
        account.deposit(500);
        System.out.println("Balance after deposit: $" + account.getBalance());

        // ✅ Using setter methods
        account.withdraw(200);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        // Attempting to access private fields directly (will cause an error)
        // System.out.println(account.accountHolderName); // Error: accountHolderName has private access in BankAccount
    }
}