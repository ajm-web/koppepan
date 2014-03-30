import junit.framework.*;

public class LatticeProblemTest extends TestCase {
	public LatticeProblemTest(String s) {
		super(s);
	}

	public void test() throws Exception {
		LatticeProblem lp = new LatticeProblem();

		// n_C_r : 40_C_20 = 137846528820
		assertEquals(137846528820L, lp.getNumOfRoute(20, 20));
	}
}
