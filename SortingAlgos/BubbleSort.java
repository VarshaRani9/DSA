public class BubbleSort {

	public static void main(String[] args) {
		int temp = 0;
		int n = 5;
		int a[] = {11,5,46,89,3};
		System.out.print("Before sorting ---> ");
		for(int e: a) {
			System.out.print(e+" ");
		}
		System.out.println();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.print("After sorting ---> ");
		for(int e: a) {
			System.out.print(e+" ");
		}
	}
}
