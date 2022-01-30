package guru.springframework;

/**
 * Created by jt on 2018-10-05.
 */
public abstract class Money {
	protected int amount;

	public abstract Money times(int multiplier); 
	
	public static Money dollar(int value) {
		return new Dollar(value);
	}

	public static Money franc(int value) {
		return new Franc(value);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && this.getClass().equals(object.getClass());
	}
}
