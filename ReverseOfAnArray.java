
public class Reversal {
	
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7};
		int n=5;
		int low=0;
		int high=n-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
			for(int element:arr) {
				System.out.println(element);
			}
			
		}
	}
}
	
