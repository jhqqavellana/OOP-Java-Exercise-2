/**
 * Represents a bank with the ability to add and retrieve bank accounts.
 */

public interface Bank {
  void addAccount(BankAccount account);

  String getAccount(int id);
}
