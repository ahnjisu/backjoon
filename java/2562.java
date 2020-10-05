import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int[] a = new int[9];
		int max = 0;
		int n;
    
		for (int i = 0; i < 9; i++) {
			a[i] = scanner.nextInt();
		}
		for (int j = 0; j < 9; j++) {
			if (j == 1) {
				max = a[j - 1] > a[j] ? a[j - 1] : a[j];
			} else if (j > 1 && j < 9) {
				max = max > a[j] ? max : a[j];
			}
		}
		for (n = 0; n < 9; n++) {
			if (a[n] == max) {
				System.out.println(max + "\n" + (n + 1));
				break;
			}
		}

	}
}
