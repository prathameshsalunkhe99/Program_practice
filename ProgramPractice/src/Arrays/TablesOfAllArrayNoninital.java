package Arrays;

import java.util.Scanner;

public class TablesOfAllArrayNoninital {
	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter no.");
			num[i]=sc.nextInt();

		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j <+10; j++) {
				System.out.print(num[i]*j+" ");
				
			}
			System.out.println();
		}
	}

}
