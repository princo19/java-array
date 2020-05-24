
public class InsertionSort {

	public static void main(String[] args) {
		int [] arr = {88,33,44,11,34,99,24,67};
		insertion(arr);
		display(arr);

	}

	public static void insertion(int[] arr) {
		for (int count = 0; count <= arr.length - 1; count++) {
			int val = arr[count];
			int j = count - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = val;
		}
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
