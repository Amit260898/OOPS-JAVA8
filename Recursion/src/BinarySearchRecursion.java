
public class BinarySearchRecursion {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,55,66,78};
		int target=78;
		System.out.println(binary(arr, target, 0, arr.length-1));
		
		
	}
	
	static int binary(int []arr,int target,int s,int e) {
		if(s>e) {
			return -1;
		}
		int mid=s+(e-s)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]<target) {
			return binary(arr, target, mid+1, e);
		}
		else {
			return binary(arr, target, s, mid-1);
		}
		
	}

}
