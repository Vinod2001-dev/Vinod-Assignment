public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Number : ");
		int a = sc.nextInt();

		int count = a;
		if (a % 2 == 0) {
			count = a - 1; 
		}

		int number = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print(number);
			if (i < count) {
				System.out.print(",");
			}
			number = number + 2;
		}
	}
}
