package Arrays;

import java.util.Scanner;

public class AddAllOddArrayNonInit {
	public static void main(String[] args) {
		int num[]=new int[5];
		int addOdd=0;
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter no");
			num[i]=sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i]%2==1) {
				addOdd=addOdd+num[i];
				
			}
		}
		System.out.println(addOdd);
		sc.close();
	}

}
