package Practice_Problrm;

import java.util.Arrays;

public class ArrRevKthEle {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Before modify: ");
		System.out.println(Arrays.toString(arr));

		int k = 3;
		int len = arr.length;
		int[] arrMod = new int[len];
		for (int i = 0; i < k; i++) {
			if (i % 2 == 0) {
				int last = arr[len - 1];
				arrMod[0] = last;
				for (int j = 1; j < len; j++) {
					arrMod[j] = arr[j - 1];
				}
			} else {
				int last = arrMod[len - 1];
				arr[0] = last;
				for (int j = 1; j < len; j++) {
					arr[j] = arrMod[j - 1];
				}
			}
		}
		if(k%2==0) {
			System.out.println("after modify: ");
			System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println("after modify: ");
			System.out.println(Arrays.toString(arrMod));
		}

	}

}
