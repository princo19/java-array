
public class SelectionSort {

	public static void main(String[] args) {
		int [] arr = {88,33,44,11,34,99,24,67};
		selection(arr);
		display(arr);
		}



	

	public static void selection(int[] arr) {
		for (int count = 0; count <= arr.length - 1; count++) {
			int min = count;
			for (int j = count +1 ; j <= arr.length - 1; j++) {
				if (arr[j] < arr[min]) 
					min = j ;
					
				
			}
			int temp = arr[min];
			arr[min] = arr[count];
			arr[count] = temp;
		}
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
