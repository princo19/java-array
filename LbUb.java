
public class LbUb {

	public static void main(String[] args) {
		int [] array = {1,2,2,3,3,4};
		System.out.println(lb(array,2));
		System.out.println(ub(array,2));

	}
	public static int lb(int [] arr , int item) {
		int l = 0 ,  h = arr.length-1;
		int ans =-1;
		while(l<=h) {
			int mid =(l+h)/2;
			if(item==arr[mid]) {
				ans=mid;
				h=mid-1;
			}else if(item<arr[mid]) {
				h=mid-1;
			}else {
				l=mid+1;
			}
			
		}
		return ans;
		
	}
	
	public static int ub(int [] arr , int item) {
		int l = 0 ,  h = arr.length-1;
		int ans =-1;
		while(l<=h) {
			int mid =(l+h)/2;
			if(item==arr[mid]) {
				ans=mid;
				l=mid+1;
			}else if(item<arr[mid]) {
				h=mid-1;
			}else {
				l=mid+1;
			}
			
		}
		return ans;
		
	}

}
