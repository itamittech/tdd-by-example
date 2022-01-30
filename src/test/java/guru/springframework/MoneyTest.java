package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	public void checkMoneyCalculation()
	{
		Dollar five= new Dollar(5);
		five.multiply(2);
		assertEquals(10, five.value);
		
	}
}
