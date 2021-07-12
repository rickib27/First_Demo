
public class LeapYear {

	public static int[] leapYearCount(int year) {
		int count = 0, n = 15, i = 0;
		int[] arr = new int[n];
		while (count < n) {
			if ((year % 4 == 0) || ((year % 400 == 0) && (year % 100 != 0))) {
				for (i = count; i < count + 1; i++) {
					arr[i] = year;

				}
				count = count + 1;
			}

			year++;
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2000;
		int[] leapYear;
		leapYear = leapYearCount(year);
		for (int i = 0; i < leapYear.length; i++) {
			System.out.println(leapYear[i]);
		}

	}

}
