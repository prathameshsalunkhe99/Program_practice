package ApnaCollage;

import java.util.Scanner;

public class ChocolateDistributionProbleam {
	Scanner sc = new Scanner(System.in);
	int num[] = new int[7];

	public int maxnoAndminno() {
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter numbers");
			num[i] = sc.nextInt();
			
		}
		int maxno = num[0];
		int minno = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > maxno) {
				maxno = num[i];
			}
				if(num[i]<minno) {
					minno=num[i];
				
			}
		}
		System.out.println("maxno"+maxno);
		System.out.println("minno"+minno);

		int sub=maxno-minno;
		return sub;
		}

	public static void main(String[] args) {
		System.out.println(new ChocolateDistributionProbleam().maxnoAndminno());
	        
	       
		
		
		
	}

}
