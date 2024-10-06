public class DecimalToBinary{
	
	private static String convert(int num) {
		String res = "";
		while(num>=2) {
			res = (num%2)+res;
			num/=2;
		}
		res = num+res;
		return res;
	}
	
	public static void main(String[] args) {
		String num = convert(7);
		System.out.println(num);
	}
}