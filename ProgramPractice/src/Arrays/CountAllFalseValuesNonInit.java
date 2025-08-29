package Arrays;

import java.util.Scanner;

public class CountAllFalseValuesNonInit {
	public static void main(String[] args) {
		boolean values[] = new boolean[5];
		int falseCount = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < values.length; i++) {
			System.out.println("Enter value");
			values[i] = sc.nextBoolean();

			if (values[i] == false) {

				falseCount++;
			}

		}
		System.out.println(falseCount);
	}

}
