public class Get_ithBit {
	private static int getBit(int n, int i) {
		return n>>i & 1;
	}
	public static void main(String[] args) {
		System.out.println(getBit(9,2));
	}

}
