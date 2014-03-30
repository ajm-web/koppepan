public class SundayCount{
	private static int monthsNormal[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static int monthsLeap[]   = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	// うるう年ならtrue
	public Boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (!(year % 400 != 0  &&  year % 100 == 0)) {
				return true;
			}
		}
		return false;
	}

	// 月の日数を返す
	public int getNumberOfDateBy(int year, int month) {
		return (isLeapYear(year)) ? monthsLeap[month-1] : monthsNormal[month-1];
	}

	// 期間中の日曜日の数をカウントする
	public int sundaycount(int y_from, int m_from, int d_from,
	                       int y_to,   int m_to,   int d_to)
	{
		// 1900/01/01:月曜日 ⇒ 1900/01/07:日曜日
		int y_now = 1900;
		int m_now = 1;
		int d_now = 7;

		int numOfSunday = 0;
		for (;;) {
			String ymd_now  = String.format("%1$04d%2$02d%3$02d", y_now,  m_now,  d_now);
			String ymd_from = String.format("%1$04d%2$02d%3$02d", y_from, m_from, d_from);
			String ymd_to   = String.format("%1$04d%2$02d%3$02d", y_to,   m_to,   d_to);

			if (ymd_now.compareTo(ymd_to)   >= 0) break;
			if (ymd_now.compareTo(ymd_from) >  0) if (d_now == 1) numOfSunday++;

			// 日付を1週間インクリメント
			d_now += 7;
			int md = this.getNumberOfDateBy(y_now, m_now);
			if (d_now > md) {
				m_now += 1;
				d_now -= md;
			}
			if (m_now > 12) {
				m_now = 1;
				y_now += 1;
			}
		}

		return numOfSunday;
	}
}
