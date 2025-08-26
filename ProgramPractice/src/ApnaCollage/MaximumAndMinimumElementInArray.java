package ApnaCollage;

import java.util.Scanner;

public class MaximumAndMinimumElementInArray {

	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter  elements");
			num[i] = sc.nextInt();
		}
		int maxno = num[0];
		int minno = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < minno) {
				minno = num[i];
			}
			if (num[i] > maxno) {
				maxno = num[i];
			}
		}
		System.out.println("minimum array:  " + minno);
		System.out.println("maximum array:  " + maxno);
		sc.close();
	}

}
