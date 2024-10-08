public class Clear_ithBit {

	private static int clearBit(int n, int i) {
		return n & ~(1<<i);
	}
	public static void main(String[] args) {
		System.out.println(clearBit(13,2));
	}

}
