package Arrays;

public class AddAllOddArrays {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		for (int i = 1; i < num.length; i++) {
			if (num[i] % 2 == 1) {
				sum = num[i] + sum;
			}
		}
		System.out.println(sum);
	}

}
