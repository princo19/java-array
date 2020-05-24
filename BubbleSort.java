
public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {99,88,77,66,44,22,11,8};
		bubble(arr);
		display(arr);
		}



	

	public static void bubble(int[] arr) {
		for (int count = 0; count <= arr.length - 1; count++) {
			for (int j = 0; j < arr.length - 1 - count; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
