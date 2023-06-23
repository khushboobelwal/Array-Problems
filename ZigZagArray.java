import java.util.Arrays;

public class ZIGZAG {
	static int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };

   
    static void zigZag()
    {
        boolean flag = true;

        int temp = 0;

        for (int i = 0; i <= arr.length - 2; i++) {
            if (flag) /* "<" relation expected */
            {
               
                if (arr[i] > arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            else 
            {
                if (arr[i] < arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag; /* flip flag */
        }
    }
		
	public static void main(String[] args) {
		zigZag();
		System.out.print(Arrays.toString(arr));
		
	
	}

}
