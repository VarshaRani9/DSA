public class BinaryToDecimal{
	
	private static int convert(String s) {
		int mul = 1;
		int res = 0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='1') {
				res += mul;
			}
			mul*=2;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int num = convert("111");
		System.out.println(num);
	}
}
