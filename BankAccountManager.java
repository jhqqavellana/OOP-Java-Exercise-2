import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Manages multiple bank accounts, allowing for adding and retrieving accounts.
 */

public class BankAccountManager implements Bank {
  private Map<Integer, BankAccount> accounts;
  private int nextAccountId;

  public BankAccountManager() {
    this.accounts = new LinkedHashMap<>();
    this.nextAccountId = 0;
  }

  @Override
  public void addAccount(BankAccount account) {
    if (accounts.size() >= 100) {
      System.out.println("Cannot add more accounts. Maximum limit reached.");
      return;
    } else {
      accounts.put(nextAccountId, account);
      System.out.println("Account added with ID: " + nextAccountId);
      nextAccountId++;
    }
  }

  @Override
  public String getAccount(int id) {
    BankAccount account = accounts.get(id);
    if (account != null) {
      return "Account ID: " + id;
    } else {
      return "No account found with ID: " + id;
    }
  }

  /** Lists all accounts in the manager. */

  public void listAccounts() {
    System.out.println("Listing all accounts:");
    Iterator<Map.Entry<Integer, BankAccount>> bankaccounts = accounts.entrySet().iterator();
    while (bankaccounts.hasNext()) {
      Map.Entry<Integer, BankAccount> entry = bankaccounts.next();
      BankAccount account = entry.getValue();
      System.out.printf(
          "Account ID: %d, Account Name: %s, Balance: %.2f%n",
          entry.getKey(), account.getOwnerName(), account.getBalance());
    }
  }

  
}
