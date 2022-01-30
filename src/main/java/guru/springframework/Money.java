package guru.springframework;

/**
 * Created by jt on 2018-10-05.
 */
public abstract class Money {
	protected int amount;
	protected String currencyCode;

	public Money(int amount, String currencyCode) {
		this.amount = amount;
		this.currencyCode = currencyCode;
	}

	public String currency() {
		return currencyCode;
	}

	public abstract Money times(int multiplier);

	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && this.getClass().equals(object.getClass());
	}
}
