package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int n = 5;
		int a[] = {11,5,46,89,3};
		System.out.print("Before sorting ---> ");
		for(int e: a) {
			System.out.print(e+" ");
		}
		System.out.println();

		for (int i = 0; i < n-1; i++) {
			int minIndex = i+1 ;
			int temp = a[i];
			for (int j=i+1; j<n; j++) {
				if(a[j]<a[minIndex])minIndex = j;	
			}
			a[i] = a[minIndex];
			a[minIndex]=temp;		
		}
		
		System.out.print("After sorting ---> ");
		for(int e: a) {
			System.out.print(e+" ");
		}
	}

}
