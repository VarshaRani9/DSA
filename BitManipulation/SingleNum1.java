import java.util.HashMap;
import java.util.Map;

public class SingleNum1 {

//	Using MAP
	private static int singleNum1(int nums[]) {
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

//	Using XOR
	private static int singleNum(int num[]){
		int ans = 0;
		for(int i=0;i<num.length;i++) {
			ans^=num[i];
		}
		return ans;
    }
	public static void main(String[] args) {
		System.out.println(singleNum1(new int[] {1,2,2,3,1}));
		System.out.println(singleNum(new int[] {1,2,2,3,1}));
	}

}
