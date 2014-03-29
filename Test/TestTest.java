import junit.framework.*;

public class TestTest extends TestCase {
	public TestTest(String s) {
		super(s);
	}

	public void test() throws Exception {
		Test test = new Test();

		int resAdd = test.add(10, 20);

		assertEquals(30, resAdd);
	}
}
