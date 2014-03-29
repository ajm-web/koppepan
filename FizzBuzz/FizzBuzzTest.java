import junit.framework.*;

public class FizzBuzzTest extends TestCase {
	public FizzBuzzTest(String s) {
		super(s);
	}

	public void test() throws Exception {

		FizzBuzz myFizzBuzz = new MyFizzBuzz();

		assertEquals("Fizz",      myFizzBuzz.calc(3));
		assertEquals("Buzz",      myFizzBuzz.calc(5));
		assertEquals("Fizz Buzz", myFizzBuzz.calc(15));

		assertEquals("-1", myFizzBuzz.calc(-1));
		assertEquals("0",  myFizzBuzz.calc(0));
		assertEquals("1",  myFizzBuzz.calc(1));

		assertEquals("2",   myFizzBuzz.calc(2));
		assertEquals("4",   myFizzBuzz.calc(4));
		assertEquals("2",   myFizzBuzz.calc(6));
		assertEquals("14",  myFizzBuzz.calc(14));
		assertEquals("16",  myFizzBuzz.calc(16));
	}
}
