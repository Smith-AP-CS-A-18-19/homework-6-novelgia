public class Homework6 {

	/* Finish the constructor and create any necessary instance
	 * variables
	 */
	public Homework6(String s, int a, int b, int c) {

	}

	/* Return true if the stored String comes before the provided
	 * String lexicographically, return false if it does not
	 */
	public boolean problem1(String other) {

	}

	/* Return the maximum of the two provided integers
	 */
	public int problem2(int x, int y) {

	}

	/* Return the maximum of the stored integers
	 * To receive credit, you must use the
	 * problem2(int, int) method above
	 */
	public int problem3() {

	}

	/* Return the median value of the stored integers. If
	 * two numbers have the same value, return one of those
	 * numbers (e.g., if the numbers are 3, 4, and 3, return 3)
	 */
	public int problem4() {

	}

	/* Return true if the stored numbers were provided in ascending
	 * order. They are considered ascending if each number is greater
	 * than or equal to the previous. To get full credit, do not use
	 * >= or =<; instead use < or > and invert them with !
	 */
	public boolean problem5() {

	}

	public static void main(String[] args) {
		int exitCode = 0;

		Homework6 hw6 = new Homework6("Drive", 4, 5, 6);

		if (!hw6.isBefore("Cars")) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		if (hw6.max() == 6) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw6.mid() == 5) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		hw6 = new Homework6("Drive", 4, 5, 5);
		if (hw6.mid() == 5) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw6.isAscending()) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}

		if (exitCode == 0) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

		System.exit(exitCode);
	}

}
