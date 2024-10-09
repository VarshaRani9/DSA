package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int n = 5;
		int a[] = {11,5,46,89,3};
		System.out.print("Before sorting ---> ");
		for(int e: a) {
			System.out.print(e+" ");
		}
		System.out.println();
		int temp = 0;
		for (int i = 1; i < n; i++) {
			temp = a[i];
			int j = i-1;
			for (; j>=0; j--) {
					if(a[j]>temp) {
						a[j+1]=a[j];
					}
					else {
						break;
					}
			}
			a[j+1]=temp;
		}
		
		System.out.print("After sorting ---> ");
		for(int e: a) {
			System.out.print(e+" ");
		}
	}

}
