
public class XOR_ofNumsInRange {

//	BRUTE
	private static int xorOfNums(int n) {
		int xor = 0;
		for(int i=1;i<=n;i++) {
			xor^=i;
		}
		return xor;
	}
	
//	BETTER
	private static int xorOfNums2(int n) {
		if(n%4==0)return n;
		if(n%4==1)return 1;
		if(n%4==2)return n+1;
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(xorOfNums(4));
		System.out.println(xorOfNums2(7));
	}

}
