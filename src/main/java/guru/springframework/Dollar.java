package guru.springframework;

/**
 * Created by jt on 2018-10-04.
 */
public class Dollar extends Money {
	public Dollar(int amount,String currencyCode) {
		super(amount,currencyCode);
	}

	public Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

}
