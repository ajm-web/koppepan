import java.util.Arrays;

public class LatticeProblem {
	public long getNumOfRoute(int x, int y) {
		long[] temporary = new long[x+1];
		Arrays.fill(temporary, 1);

		for (int yy=0; yy<y; yy++) {
			for (int xx=1; xx<=x; xx++) {
				temporary[xx] += temporary[xx-1];
			}
		}

		return temporary[x];
	}
}
