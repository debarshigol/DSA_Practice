package Practice_Problrm;

import java.util.*;

public class Rotate {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5 };
		int k = 1;
		int len = arr.length - 1;
		int s = 0;
		rotate(arr, s, len);
		rotate(arr, s, k - 1);
		rotate(arr, k, len);
		System.out.println(Arrays.toString(arr));
	}

	public static void rotate(int nums[], int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
