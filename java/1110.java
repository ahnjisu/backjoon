import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int count = 0;

		int N = scanner.nextInt();
		int a = N;
		int n= 0;
		
		while (true) {

			a = a % 10 * 10 + (a / 10 + a % 10) % 10;
			n = a;

			count++;

			if (n == N) {
				break;
			}

		}

		System.out.println(count);

	}
}
