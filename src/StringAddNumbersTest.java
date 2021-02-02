import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class StringAddNumbersTest {

	private StringAddNumbers obj = new StringAddNumbers();

	@Test
	public void testEmptyString() throws Exception {
		assertEquals(0, obj.AddStringNumber(""));
	}

	@Test
	public void testOneNumber() throws Exception {
		String number = "2";
		assertEquals(2, obj.AddStringNumber(number));
	}

	@Test
	public void testCommaDelimiterSum() throws Exception {
		String num = "5,10";
		assertEquals(15, obj.AddStringNumber(num));
	}

	@Test
	public void NegativeNumberThrowsException() throws Exception {
		assertThrows(Exception.class, () -> {
			obj.AddStringNumber("-20");
		});
	}

	@Test
	public void testNewLineDelimeter() throws Exception {
		String num = "1\n2,3\n4";
		assertEquals(10, obj.AddStringNumber(num));
	}

	@Test
	public void testOtherDelimiters() throws Exception {
		String num = "//;\n6;9";
		assertEquals(15, obj.AddStringNumber(num));
	}

	@Test
	public void testUnknownNumbers() throws Exception {
		Random random = new Random();
		int totalNums = random.nextInt(20);
		int expectedSum = 0;
		String nums = "";
		for (int i = 0; i < totalNums; i++) {
			int number = random.nextInt(50);
			nums += String.valueOf(number);
			if (i < totalNums - 1)
				nums += ",";
			expectedSum += number;
		}
		assertEquals(expectedSum, obj.AddStringNumber(nums));
	}

}
