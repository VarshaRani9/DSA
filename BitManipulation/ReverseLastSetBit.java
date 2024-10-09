public class ReverseLastSetBit {
	private static int revBit(int n) {
		return n & (n-1);
	}
	public static void main(String[] args) {
		System.out.println(revBit(9));
	}
}
