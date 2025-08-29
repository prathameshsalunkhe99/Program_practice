package Arrays;

import java.util.Scanner;

public class PrintAllTwoDigitsNonInit {
	public static void main(String[] args) {
		int num[]= new int [5];
		Scanner sc= new Scanner(System.in); 
		for (int j = 0; j < num.length; j++) {
			
		System.out.println("enter no");
		num[j]=sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if(num[i]>=10 && num[i]<100) {
			System.out.println(num[i]);
			}
		}
		
	}

}
