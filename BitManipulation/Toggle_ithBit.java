public class Toggle_ithBit {

	private static int toggleBit(int n, int i) {
		return n ^ (1<<i);
	}
	public static void main(String[] args) {
		System.out.println(toggleBit(9,2));
	}

}
