import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N; j++) {
				if (j + i <= N - 1)
					System.out.print(" ");
				else if (j + i > N - 1)
					System.out.print("*");
			}
			System.out.println();
		}

	}
}
