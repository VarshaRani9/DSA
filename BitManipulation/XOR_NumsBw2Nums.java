public class XOR_NumsBw2Nums {

//	BRUTE
	private static int xorOfNums(int n1, int n2) {
		int xor = 0;
		for(int i=n1;i<=n2;i++) {
			xor = xor^i;
		}
		return xor;
	}
	
//	BETTER
	private static int xorOfnNums(int n) {
		if(n%4==0)return n;
		if(n%4==1)return 1;
		if(n%4==2)return n+1;
		return 0;
	}
	private static int xorOfNums2(int n1, int n2) {
		return xorOfnNums(n2) ^ xorOfnNums(n1-1);
	}
	
	public static void main(String[] args) {
		System.out.println(xorOfNums(4,7));
		System.out.println(xorOfNums2(4,7));
	}


}
