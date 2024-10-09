package sorting;

public class MergeSort {

	private static void mergeSort(int a[], int l, int h) {
		if(l<h) {
			int mid = (l+h)/2;
			mergeSort(a, 0,mid);
			mergeSort(a, mid+1, h);
			merge(a,l, mid, h);
		}
	}
	private static void merge(int a[], int l, int mid, int h) {
		int i =l;
		int j =mid+1;
		int k=l;
		int[] res=new int[a.length];
		while(i<=mid && j<=h) {
			if(a[i]<=a[j]) {
				res[k++]=a[i];
				i++;
			}
			else {
				res[k++]=a[j];
				j++;
			}
		}
		if(i>mid) {
			while(j<=h) {
				res[k++]=a[j];
				j++;
			}
		}
		else {
			while(i<=mid) {
				res[k++]=a[i];
				i++;
			}
		}
		for (i = l; i <= h; i++) {
		    a[i] = res[i];
		  }
	}
	public static void main(String[] args) {
		int n = 5;
		int a[] = {11,5,46,89,3};
		System.out.print("Before sorting ---> ");
		for(int e: a) {
			System.out.print(e+" ");
		}
		System.out.println();
		mergeSort(a,0,n-1);
		System.out.print("After sorting ---> ");
		for(int e: a) {
			System.out.print(e+" ");
		}
	}

}
