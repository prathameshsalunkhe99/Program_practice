package Arrays;

public class CountAllOddArray {
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7};
		int count=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==1) {
				count++;
			}
		}
		System.out.println(count);
	}
	

}
