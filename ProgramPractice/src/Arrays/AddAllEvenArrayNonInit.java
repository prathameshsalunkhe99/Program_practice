package Arrays;

import java.util.Scanner;

public class AddAllEvenArrayNonInit {
	public static void main(String[] args) {
		int num[]= new int[5];
		int countno=0;
		Scanner sc=new Scanner(System.in);
		for(int i =0;i<num.length;i++) {
			System.out.println("Enter a number");
			num[i]=sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i]%2==0) {
				countno=countno+num[i];
			}
		}
		System.out.println(countno);
		sc.close();
	}
	
	

}
