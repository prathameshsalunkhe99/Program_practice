package Arrays;

import java.util.Scanner;

public class AveragrOfAllOddArray {
	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter no");
			num[i] = sc.nextInt();

		}
		int sum = 0;
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 1) {
				count++;
				sum = sum + num[i];
			}
		}
		System.out.println((float) (sum / count));
	}

}
