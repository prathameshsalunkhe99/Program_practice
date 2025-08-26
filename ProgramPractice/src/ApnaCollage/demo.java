package ApnaCollage;

import java.util.Scanner;

public class demo {
Scanner sc = new Scanner(System.in);
	int num[]=new int[7];
	
	public int maxandminNo() {
		for (int i = 0; i < num.length; i++) {
			System.out.println("enter elements");
			num[i]=sc.nextInt();
		}
		int max=num[0];
		int min=num[0];
		for (int i = 1; i < num.length; i++) {
			if(num[i]>max) {
				max=num[i];
				
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("maximum no "+max);
		System.out.println("minimum no"+min);
		int sub=max-min;
		
		return sub;
	}
	public static void main(String[] args) {
		System.out.println(new demo().maxandminNo());
	}
}
