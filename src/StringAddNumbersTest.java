import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringAddNumbersTest {
	
	private StringAddNumbers obj = new StringAddNumbers();

	@Test
	public void testEmptyString() throws Exception {
		assertEquals(0, obj.AddStringNumber(""));
	}
	
	@Test
	public void testOneNumber() throws Exception
	{
		String number = "2";
		assertEquals(2, obj.AddStringNumber(number));
	}
	
	@Test
	public void testCommaDelimiterSum() throws Exception
	{
		String num = "5,10";
		assertEquals(15, obj.AddStringNumber(num));
	}

}
