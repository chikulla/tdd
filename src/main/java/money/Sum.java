package money;

public class Sum implements Expression {
  Money augend;
  Money addend;

  Sum(Money money, Money addend) {
    this.augend = money;
    this.addend = addend;
  }

  public Money reduce(String to) {
    int amount = this.augend.amount + this.addend.amount;
    return new Money(amount, to);
  }
}
