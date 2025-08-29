package Arrays;

public class CountEvenArray {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6,7,8,8 };
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0) {
				count ++;
			}

		}
		System.out.println(count);
	}

}
