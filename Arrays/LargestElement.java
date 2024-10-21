package oneDimensional;

import java.util.Arrays;

public class LargestElement {
	
	private static int largest_brute(int[] a) {
        Arrays.sort(a);
        return a[a.length-1];
    }
	
	private static int largest(int[] a) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max)max = a[i];
        }
        return max;
    }
	
	public static void main(String[] args) {
		System.out.println(largest_brute(new int[] {1,6,3,18,9,22,5}));
		System.out.println(largest(new int[] {1,6,3,18,9,22,5}));
	}

}
