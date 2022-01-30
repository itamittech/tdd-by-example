package guru.springframework;

/**
 * Created by jt on 2018-10-05.
 */
public class Franc extends Money {
	
	public Franc(int amount, String currencyCode) {
		super(amount,currencyCode);
	}

	public Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}
}
