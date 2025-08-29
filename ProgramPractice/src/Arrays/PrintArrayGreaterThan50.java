package Arrays;

public class PrintArrayGreaterThan50 {
      public static void main(String[] args) {
		
    	  int num[]= {111,2,3,4,50,6,70};
    	  for (int i = 0; i < num.length; i++) {
			if(num[i]>=50) {
				System.out.println(num[i]);
			}
		}
	}
}
