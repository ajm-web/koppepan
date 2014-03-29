import junit.framework.*;

public class FizzBuzzTest extends TestCase {
	public FizzBuzzTest(String s) {
		super(s);
	}

	public void test() throws Exception {
		FizzBuzz myFizzBuzz = new MyFizzBuzz();

		String fizz = myFizzBuzz.calc(3);
		String buzz = myFizzBuzz.calc(5);
		String fizzbuzz = myFizzBuzz.calc(15);

		assertEquals("Fizz", fizz);
		assertEquals("Buzz", buzz);
		assertEquals("Fizz Buzz", fizzbuzz);
	}
}
