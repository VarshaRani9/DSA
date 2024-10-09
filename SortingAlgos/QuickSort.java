package sorting;

public class QuickSort {
	
	private static int[] quick(int[] a, int l, int h) {
		if(l<h) {
			int pivot = part(a, l, h);
			quick(a, l, pivot-1);
			quick(a, pivot+1, h);
		}
		return a;
	}
	private static int part(int[] a, int l, int h) {
		int i = l;
		int j = h;
		int pivot = l;
		while(i<j) {
			while(i<j && a[i]<=a[pivot])i++;
			while(a[j]>a[pivot])j--;
			if(i<j) {
				int temp = a[i];
				a[i]=a[j];
				a[j] = temp;
			}
		}
		int temp =a[j];
		a[j] = a[l];
		a[l] = temp;
		return j;
	}

	public static void main(String[] args) {
		int a[] = {11,5,46,89,3};
		System.out.print("Before sorting ---> ");
		for(int e: a) {
			System.out.print(e+" ");
		}
		System.out.println();

		int arr[] = quick(a,0,a.length-1);
		System.out.print("After sorting ---> ");
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}

}
