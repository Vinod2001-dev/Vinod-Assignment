
public class Problem4 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };

		int[] count = new int[9];

		for (int i = 1; i <= 9; i++) {
			int c = 0;
			for (int j = 0; j < num.length; j++) {
				if (num[j] % i == 0) {
					c++;
				}
			}
			count[i - 1] = c;
		}
		System.out.print("{");
		for (int i = 0; i < 9; i++) {
			System.out.print((i + 1) + ":" + count[i]);
			if (i < 8) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}

}
