package DSA_Practice;

public class BubbleSort {

	public static void main(String[] args) {
		/* taking an array
		 * sort it using BubbleSort
		 */
		
		int[] arr = {2,53,72,47,95,51,90,86,4,76,4,7,8};
		
		// printing the not-sorted array
		System.out.println("Not-Sorted: ");
		for (int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		// sorting part
		int size = arr.length;
		for (int i = 0; i < size-1; i++) {
			for (int j = 0; j < size-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
			}
			}
			
			// to check in every steps
			System.out.println("Sorted: Step "+i);
			for (int num : arr) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

}
