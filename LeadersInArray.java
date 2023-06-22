public class Leaders {
	public static void LeadersInArray(int arr[],int n) {
		int currLead=arr[n-1];
		System.out.println(currLead);
		for(int i=n-2;i>=0;i--) {
			if(currLead<arr[i]) {
				currLead=arr[i];
				System.out.println(currLead);
				
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {10,30,20,11};
		int n=4;
		LeadersInArray(arr,n);
		// TODO Auto-generated method stub

	}

}
