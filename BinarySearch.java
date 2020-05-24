import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter item to be searched:");
		int n = scn.nextInt();
		scn.close();
		int [] array = {2,3,5,12,20,23,45,56,60,62,65,70,75,76,78,87,90,97};
		System.out.println("Element "+ n + " found at " + binary(array,n) + "th position ");
		

	}
	public static int binary(int [] arr, int item) {
		int lo=0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid]<item) {
				lo=mid+1;
			}else if(arr[mid]>item){
				hi=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
