public class DivideTwoIntegers {

	private static int divide(int divisor, int dividend) {
		int sum = 0, counter = 0;
		while (sum <= dividend) {
			sum += divisor;
			counter++;
		}
		return counter - 1;
	}

	private static int divide1(int divisor, int dividend) {
		int ans = 0;
		if (dividend == divisor)
			return 1;
		boolean sign = true;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
			sign = false;
		}
		long n = Math.abs((long)dividend);
		long d = Math.abs((long)divisor);
		while (d <= n) {
			int counter = 0;
			while (n >= (d << counter + 1)) {
				counter++;
			}
			ans += 1 << counter;
			n = n - (d * 1 << counter);
		}

		if (ans == (1 << 30) && sign == true)
			return Integer.MAX_VALUE;
		if (ans == (1 << 30) && sign == false)
			return Integer.MIN_VALUE;
		return sign ? ans : -1 * ans;
	}

	public static void main(String[] args) {
		System.out.println(divide(5, 18));
		System.out.println(divide1(5, -18));
	}

}
