import junit.framework.*;

public class FizzBuzzTest extends TestCase {
	public FizzBuzzTest(String s) {
		super(s);
	}

	public void test() throws Exception {

		FizzBuzz myFizzBuzz = new MyFizzBuzz();

//		String fizz = myFizzBuzz.calc(3);
//		String buzz = myFizzBuzz.calc(5);
//		String fizzbuzz = myFizzBuzz.calc(15);
//		String other = myFizzBuzz.calc(11);

		for(int i = 0 ; i < 20 ; i++){
			assertEquals("Fizz", i);
			assertEquals("Buzz", i);
			assertEquals("Fizz Buzz", i);
			assertEquals("11", i);
		}
	}
}
