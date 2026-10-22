/** Runs the bank account test cases. */
public class Main {
  /** Executes the sample bank account operations and manager tests. */
  public static void main(String[] args) {
    BankAccount account1 = new SavingsAccount("Test0");
    account1.deposit(1000.125);
    account1.deposit(0);
    account1.deposit(-500);
    account1.withdraw(500);
    account1.withdraw(1500);
    account1.withdraw(-100);
    account1.freezeAccount();
    account1.deposit(11500);
    account1.withdraw(500);
    account1.unfreezeAccount();
    account1.withdraw(100);

    System.out.println("Transaction history:");
    System.out.println(account1.getTransactionHistory());

    BankAccountManager accM1 = new BankAccountManager();
    accM1.addAccount(account1);
    accM1.addAccount(new SavingsAccount("Test1"));
    accM1.listAccounts();
  }
}