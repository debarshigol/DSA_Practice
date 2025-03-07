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
		
		int start = 0;
		int end = arr.length-1;
		int count = 0;
		
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[start]==target) {
				System.out.printf("Number %d found at index %d",target,start);
				break;
			}
			else if(arr[end]==target) {
				System.out.printf("Number %d found at index %d",target,end);
				break;
			}
			else if(arr[mid]==target) {
				count+=1;
				System.out.printf("Number %d found at index %d",target,mid);
				break;
			}
			else if(arr[mid]<target) {
				start = mid;
				count+=1;
			}
			else {
				end = mid;
				count+=1;
			}
			
		}
		System.out.println();
		System.out.println(count);

	}

}
