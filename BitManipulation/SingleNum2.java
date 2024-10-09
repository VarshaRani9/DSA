// Every number appears three times except for a number which appears only once.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNum2 {

//	Using MAP
	private static int singleNum(int nums[]) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = nums.length;
		for(int i=0;i<n;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1)return entry.getKey();
		}
		return -1;
	}
	
//	Bitwise
	private static int singleNum2(int nums[]) {
		int ans = 0;
		int n = nums.length;
		for(int bitIndex=0;bitIndex<32;bitIndex++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if ((nums[j] & (1 << bitIndex)) != 0){
					count++;
				}
			}
			if(count%3==1) ans = ans | (1<<bitIndex);
		}
		
		return ans;
	}
	
	private static int singleNum3(int nums[]) {
		int n = nums.length;
		Arrays.sort(nums);
		for(int i=1;i<n;i+=3) {
			if(nums[i]!=nums[i-1])return nums[i-1];
		}
		return nums[n-1];
	}
	
	private static int singleNum4(int nums[]) {
		int ones = 0;
		int twos = 0;
		int n = nums.length;
		for(int i=1;i<n;i++) {
			ones = ((ones^nums[i])& ~twos);
			twos = ((twos^nums[i])& ~ones);
		}
		return ones;
	}

	public static void main(String[] args) {
		System.out.println(singleNum(new int[] {4,4,5,2,4,5,5}));
		System.out.println(singleNum2(new int[] {4,4,5,2,4,5,5}));
		System.out.println(singleNum3(new int[] {4,4,5,2,4,5,5}));
		System.out.println(singleNum4(new int[] {4,4,5,2,4,5,5}));
	}

}
