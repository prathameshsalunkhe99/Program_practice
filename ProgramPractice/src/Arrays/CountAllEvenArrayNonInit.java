package Arrays;

import java.util.Scanner;

public class CountAllEvenArrayNonInit {
	public static void main(String[] args) {
		
		int num[]= new int[5];
		int count=0;
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			System.out.println("enter no");
			num[i]=sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0) {
			count++;
			}
		}
		System.out.println(count);
	}

}
