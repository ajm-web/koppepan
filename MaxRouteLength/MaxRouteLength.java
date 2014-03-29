public class MaxRouteLength{
	public int ttt(int[][] data, int y, int x, int s) {
		int nextS = s + data[y][x];

		if (y >= data.length - 1) { return nextS; }

		int[] tmp = {ttt(data, y+1, x, nextS), ttt(data, y+1, x+1, nextS)};
		return (tmp[0] > tmp[1]) ? tmp[0] : tmp[1];
	}

	public int getRouteLength(int[][] data){
		return ttt(data, 0, 0, 0);
	}
}
