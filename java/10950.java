import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A;
		int B;
		int T = scanner.nextInt();
		int a[] = new int[T];

		for (int i = 0; i < T; i++) {

			A = scanner.nextInt();
			B = scanner.nextInt();
			a[i] = A + B;
		}

		for (int j = 0; j < T; j++) {
			System.out.println(a[j]);
		}

	}

}
