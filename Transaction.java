import java.time.LocalDateTime;

/** Represents a bank account transaction. */

public class Transaction {
  private final String type;
  private final double amount;
  private final LocalDateTime dateTime;

  /**
   * Creates a transaction with the specified type and amount.
   *
   * @param type the transaction type
   * @param amount the transaction amount
   */

  public Transaction(String type, double amount) {
    this.type = type;
    this.amount = amount;
    this.dateTime = LocalDateTime.now();
  }

  /**
   * Returns a string representation of this transaction.
   *
   * @return a string representation of this transaction
   */
  @Override
  public String toString() {
    return "\nTransaction:{"
        + "type='"
        + type
        + '\''
        + ", amount="
        + amount
        + ", dateTime="
        + dateTime
        + "}";
  }
}
