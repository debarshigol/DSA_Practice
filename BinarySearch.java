package DSA_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {2,53,72,47,95,51,90,86,4,76,4,7,8};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("Enter your number: ");
		Scanner input = new Scanner(System.in);
		int target = input.nextInt();
		int vaule = findElement(arr, target);
		if(vaule==-1) {
			System.out.println("Element not found!");
		}
		else {
			System.out.println("Target is found at index: "+vaule);
		}
		
	}
	
	public static int findElement(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int count = 0;
		while(start<=end) {
			int mid  = (start+end)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid]<target) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return -1;

	}

}

