// Every number appears two times except for two distinct numbers which appears only once.

import java.util.HashMap;
import java.util.Map;

public class SingleNum3 {

//	Using MAP
	private static int[] singleNum(int nums[]) {
		Map<Integer, Integer> map = new HashMap<>();
		int res[] = new int[2];
		int ind = 0;
		int n = nums.length;
		for(int i=0;i<n;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1)res[ind++]=entry.getKey();
		}
		return res;
	}

//	XOR
	private static int[] singleNumm(int nums[]) {
		long xor = 0;
		int n = nums.length;
		for(int i=0;i<n;i++) {
			xor^=nums[i];
		}
		long rightmost = (xor & xor-1)^xor;
		int b1=0, b2=0;
		for(int i =0;i<n;i++) {
			if((nums[i]&rightmost)!=0) {
				b1^=nums[i];
			}
			else b2^=nums[i];
		}
		return new int[] {b1,b2};
	}

	public static void main(String[] args) {
		int[] res1 = singleNum(new int[] {4,4,1,2,6,2});
		for(int e: res1) {
			System.out.print(e+" ");
		}
		System.out.println();
		int[] res2 = singleNumm(new int[] {4, 2, 4, 5, 2, 3, 3, 1});
		for(int e: res2) {
			System.out.print(e+" ");
		}
	}

}
