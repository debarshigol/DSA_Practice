package DSA_Practice;

public class SelectionSort {

	public static void main(String[] args) {
		/* taking an array
		 * sort it using SelectionSort
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
					for (int j = i+1; j < size; j++) {
						if(arr[i]>arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
					}
					}
					
					// to check in every steps
					System.out.println("Sorted: Step->"+(i+1));
					for (int num : arr) {
						System.out.print(num+" ");
					}
					System.out.println();
				}

	}

}
