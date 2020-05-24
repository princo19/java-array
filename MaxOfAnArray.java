
import java.util.Scanner;

public class MaxOfAnArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = takeInput();
		display(array);
		System.out.println("Maxmium is:" + maxInArray(array));

	}

	public static int[] takeInput() {
		System.out.println("Enter Size?");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for " + i + " index ?");
			arr[i] = scn.nextInt();
		}
		return arr;

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static int maxInArray(int [] arr) {
		int max=Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}