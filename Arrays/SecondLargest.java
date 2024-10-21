package oneDimensional;

import java.util.Arrays;

public class SecondLargest {

	private static int print2largest_brute(int[] a) {
        Arrays.sort(a);
        return a[a.length-2];
    }
	private static int print2largest_optimal(int[] a) {
        int max = -1;
        int secMax = -1;
        for(int i = 0;i<a.length;i++){
            if(a[i]>max){
                secMax = max;
                max = a[i];
            }
            else if(a[i]>secMax && a[i]<max){
                secMax = a[i];
            }
        }
        return secMax;
    }
	
	public static void main(String[] args) {
		System.out.println(print2largest_brute(new int[] {12, 35, 1, 10, 34, 1}));
		System.out.println(print2largest_optimal(new int[] {12, 35, 1, 10, 34, 1}));
	}

}
