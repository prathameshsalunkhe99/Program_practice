package Arrays;

import java.util.Scanner;

public class AllEvenArray {
	public static void main(String[] args) {
		int num[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter no");
			num[i] = sc.nextInt();

		}
		for(int i=0;i<num.length;i++ ) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		sc.close();

	}

}
