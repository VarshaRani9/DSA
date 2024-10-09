
public class MinBitFlipToConvertANumber {

	private static int minBitFlips(int start, int goal) {
        int res = start^goal;
        int count = 0;
        while(res!=0){
            res = res&(res-1);
            count++;
        }
        return count++;
    }
	public static void main(String[] args) {
		System.out.println(minBitFlips(10, 7));
	}
}
