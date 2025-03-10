package Practice_Problrm;

public class NumSumToOneDigit {

	public static void main(String[] args) {
		/*
		 * input = 12345 output = 6 total sum = 15 ->6
		 */

		int num = 124563;
		System.out.println(numSum(num));

	}

	public static int numSum(int num) {
		int temp = num;
		int sum = 0;
		while (temp>0) {
			sum += temp % 10;
			temp /= 10;
		}
		if(sum<10) {
			return sum;
		}
			return numSum(sum);
			
	}

}
