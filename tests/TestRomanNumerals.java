import static org.junit.Assert.*;


import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		RomanNumerals test = new RomanNumerals();
		assertEquals('I', test.convertToInteger("IIII"));
	}

}
