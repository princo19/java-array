
public class ArraySwap {

	public static void main(String[] args) {
		int []arr = new int[5];

		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		int i=0 , j =2;
//		non working swap
//		System.out.println(arr[i]+ " " + arr[j]);
//		Swap(arr[i],arr[j]);
//		System.out.println(arr[i]+ " " + arr[j]);
		
		//working swap
		System.out.println(arr[i]+ " " + arr[j]);
		Swap(arr,i,j);
		System.out.println(arr[i]+ " " + arr[j]);
		
		//other method
		int [] other= {100,200,300};
		System.out.println(arr[0]+ " "+ other[0]);
		Swap(arr,other);
		System.out.println(arr[0]+ " "+ other[0]);
			

	}
	public static void Swap(int [] arr , int i,int j) {
		System.out.println(arr[i]+ " " + arr[j]);
		
		int temp = arr[i];
		arr[i] = arr[j] ; 
		arr[j]= temp;
		System.out.println(arr[i]+ " " + arr[j]);
	}
	
	public static void Swap(int [] one , int [] two) {
		int [] temp=one;
		one=two;
		two =temp;
	}

}
