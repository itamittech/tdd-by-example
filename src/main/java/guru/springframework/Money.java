package guru.springframework;

/**
 * Created by jt on 2018-10-05.
 */
public class Money {
	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	protected String currency() {
		return currency;
	}

	public Money times(int multiplier) {
		return new Money(this.amount * multiplier, this.currency);
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && this.currency.equals(money.currency);
	}
}
