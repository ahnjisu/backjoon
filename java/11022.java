import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int[] a = new int[T];
		int[] b = new int[T];

		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			a[i] = A;
			b[i] = B;
		}
		for (int i = 1; i <= T; i++) {
			System.out.println("Case #" + i + ": " + a[i - 1] + " + " + b[i - 1] + " = " + (a[i - 1] + b[i - 1]));
		}
	}
}
