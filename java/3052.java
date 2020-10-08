import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int a[] = new int[10];
		int count = 0;
		int counts[] = new int[42];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			counts[a[i]%42]++;
		}
		for (int j = 0; j < counts.length; j++) {
			if (counts[j] != 0)
				count++;
		}
		System.out.println(count);

	}
}
