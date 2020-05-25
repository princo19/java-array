import java.util.Scanner;

public class ARRAY2D {

	public static void main(String[] args) {
		int array[][]=takeInput();
		display(array);
		

	}

	public static int[][] takeInput() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int rows = scn.nextInt();
		int columns = scn.nextInt();
		System.out.println("Enter the elements:");
		int[][] arr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = scn.nextInt();
			}
		}scn.close();
		return arr;
	}

	public static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");

			}
			System.out.println();

		}
	}

}
