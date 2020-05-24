
public class Array0 {

	public static void main(String[] args) {
		//declare an array
		int [] arr = null;
		System.out.println(arr);
		
		//allocating space to an array
		arr = new int[5];
		System.out.println(arr);
		
		//get the values
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//set the values
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//get 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		//get the values using for loop
		for(int i = 0 ; i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		//using enhanced for loop
		for(int val:arr) {
			System.out.println(val);
		}
		
		
		//get reverse 
		for(int i =arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
