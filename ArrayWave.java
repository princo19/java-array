
public class ArrayWave {

	public static void main(String[] args) {
		int [][]arr= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		Wave(arr);

	}
	public static void Wave(int [][]arr) {
		for(int i=0 ;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}else {
				for(int j=arr.length-1;j>=0;j--) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}
		}
		
	}

}
