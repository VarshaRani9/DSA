package oneDimensional;

public class SortedAndRotated {

	private static boolean sorted(int[] a) {
		int min = a[0];
        int breakCt =0;
        for(int i=1;i<a.length;i++) {
			if(a[i]<a[i-1])breakCt++;
            if(breakCt==1){
                if(a[i]>min)return false;
            }
		}
		return breakCt>1? false: true;
	}
	public static void main(String[] args) {
		System.out.println(sorted(new int[] {2,1,3,4}));
	}

}
