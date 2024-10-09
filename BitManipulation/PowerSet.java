import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	private static List<List<Integer>> powerSet(int nums[]){
		List<List<Integer>> list = new ArrayList<>();
		int n = nums.length;
		int subsets = 1<<n;
		List<Integer> l;
		 for(int i=0;i<subsets;i++) {
			 l = new ArrayList<>();
			 for(int j=0; j<n; j++) {
				 if((i&(1<<j))!=0) {
					 l.add(nums[j]);
				 }
			 }
			 list.add(l);
		 }
		return list;
    }
	
	public static void main(String[] args) {
		List<List<Integer>> list = powerSet(new int[]{1,2,3});
		System.out.println(list);
	}

}
