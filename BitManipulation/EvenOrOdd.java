public class EvenOrOdd {

	private static String even_odd(int n) {
		return (n&1)==1 ? "Odd": "Even";
	}
	
	public static void main(String[] args) {
		System.out.println(even_odd(18));
	}

}
