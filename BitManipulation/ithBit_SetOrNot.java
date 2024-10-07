public class ithBit_SetOrNot {

	private static String convertToBinary(int num) {
		String res = "";
		while(num>=2) {
			res = (num%2)+res;
			num/=2;
		}
		res = num+res;
		return res;
	}
	private static boolean checkBit_traversal(int num, int bit) {
		String binary = convertToBinary(num);
		for(int i=binary.length()-1; i>=0; i--) {
			if(bit!=0) {
				bit--;
				continue;
			}
			return (binary.charAt(i) =='1')? true : false;
		}
		return false;
	}

	private static boolean checkBit_leftShift(int num, int bit) {
		return (num & (1<<bit))!=0? true : false;
	}

	private static boolean checkBit_rightShift(int num, int bit) {
		return ((num>>bit)&1)!=0? true: false;
	}

	public static void main(String[] args) {
		System.out.println(checkBit_traversal(13, 1));
		System.out.println(checkBit_leftShift(13,1));
		System.out.println(checkBit_rightShift(13, 1));
	}

}
