// initial set up for Startup
public class Startup {
  private int debit;
  private int credit;
  // private int balance;
  public Startup() {
    this.debit = debit;
    this.credit = credit;
    // this.balance = credit - debit;
  }
  public int getDebit() {
    return debit;
  }
  public int getCredit() {
    return credit;
  }
  public int getBalance(int credit, int debit) {
    return getCredit() - getDebit();
  }
}

public class BankAccount {
  private Startup s;
  private Debit d;
  private Credit c;

  public BankAccount(Startup s) {
    // super(s);
    this.s = s;
  }
  public void debt(Debit d) {
    this.d = d;
  }
  public void credit(Credit c) {
    this.c = c;
  }
  public int getBalance() {
    return super.getBalance() + c - d;
  }
}

public class MinMaxAccount extends BankAccount {
  public MinMaxAccount(Startup startup) {
    super(startup);
    this.startup = startup;
  }
  public int getMin(Credit c, Debt d) {
    return super.getBalance() - d;
  }
  public int getMax(Credit c, Debt d) {
    return super.getBalance() + c;
  }
}
