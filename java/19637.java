import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] a = new int[N];
		int max = 0, min = 0;

		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
		}
		for (int j = 0; j < N; j++) {
			if (j == 1) {
				max = a[j - 1] > a[j] ? a[j - 1] : a[j];
				min = a[j - 1] < a[j] ? a[j - 1] : a[j];
			} else if (j > 1 && j < N) {
				max = max > a[j] ? max : a[j];
				min = min < a[j] ? min : a[j];
			}
		}
		if(N==1) {
			max = min = a[0];
		}

		System.out.println(min + " " + max);

	}
}
