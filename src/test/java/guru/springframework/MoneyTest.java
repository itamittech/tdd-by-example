package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jt on 2018-10-04.
 */
public class MoneyTest {

	@Test
	void testMultiplication() {
		Dollar five = new Dollar(5);
		assertEquals(10, five.times(2));
		assertEquals(15, five.times(3));
	}
}
