public class CountSetBits {
	
	private static int countSetBits(int n) {
		int count = 0;
		while(n>=1) {
//			if(n%2==1)count++;
//			n/=2;
			if((n&1)==1)count++;
			n=n>>1;
		}
		return count;
	}
	
	private static int countSetBit(int n) {
		int count = 0;
		while(n!=0) {
			count++;
			n = (n&(n-1));
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countSetBits(4));
		System.out.println(countSetBit(4));
	}
}
