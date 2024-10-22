package oneDimensional;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

//	BRUTE
	private static int remove(int[] a) {
		Set<Integer> set = new TreeSet<Integer>();
		for(int e: a) {
			set.add(e);
		}
		int i =0;
		for(int e: set) {
			a[i++]=e;
		}
		return i;
	}
//	OPTIMAL
	private static int remove_optimal(int[] a) {
		int n = a.length;
		if(n==1 || n==0)return n;
		int l=0, r=1;
		while(r<n) {
			if(r!=l && a[r]==a[l]) {
				r++;
			}
			else {
				a[++l] = a[r];
                r++;
			}
		}
		return ++l;
	}
	private static int remove_optimal2(int[] a) {
		int n = a.length;
		if(n==1 || n==0)return n;
		int x = 0;
        for(int i =1;i<n;i++){
            if(a[i]!=a[x]){
                a[++x]=a[i];
            }
        }
        return ++x;
	}

	public static void main(String[] args) {
		System.out.println(remove(new int[] {0,0,1,1,1,2,2,3,3,4}));
		System.out.println(remove_optimal(new int[] {0,1,1,2,3,3,3,4,5,5}));
		System.out.println(remove_optimal2(new int[] {0,1,1,2,3,3,3,4,5,5}));
	}

}
