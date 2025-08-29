package Arrays;

public class TableOFAllArray {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(num[i] * j + " ");

			}
			System.out.println();
		}
	}

}
