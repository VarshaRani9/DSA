public class LinearSearch {

	private static int search(int arr[], int K) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==K)return 1;
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(search(new int[] {5,20,33,6,45}, 6));
	}

}
