package ApnaCollage;

import java.util.Scanner;

public class ReversTheArray {
	public static void main(String[] args) {
		
		int num[]= new int[5];
		Scanner sc =new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter no");
			num[i]=sc.nextInt();
		}
		for (int i = num.length-1;i>=0; i--) {
			System.out.println(num[i]);
			
		}
	}

}
