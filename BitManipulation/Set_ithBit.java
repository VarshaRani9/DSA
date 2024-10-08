public class Set_ithBit {

	private static int setBit(int n, int i) {
		return n | (1<<i);
	}
	public static void main(String[] args) {
		System.out.println(setBit(9,2));
	}

}
