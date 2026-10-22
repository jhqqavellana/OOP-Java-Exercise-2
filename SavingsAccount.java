/**
 * Represents a Savings Account with owner setter and getter.
 */
public class SavingsAccount extends BankAccount {
  private String ownerName;

  /**
 * Represents a Savings Account with owner setter and getter.
 */
  public SavingsAccount(String ownerName) {
    super(ownerName);
    this.ownerName = ownerName;
    System.out.println("Savings Account Name: " + ownerName);
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
  
}
