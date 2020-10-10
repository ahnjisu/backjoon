import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String ox[] = new String[N];

		for (int i = 0; i < N; i++) {
			ox[i] = scanner.next();
		}
		for (int i = 0; i < N; i++) {
			int sum = 0;
			int point[] = new int[80];
			for (int j = 0; j < ox[i].length(); j++) {
				if (ox[i].charAt(j) == 'X')
					point[j] = 0;
				else if (ox[i].charAt(j) == 'O') {
					if (j > 0 && point[j - 1] > 0)
						point[j] = point[j - 1] + 1;
					else
						point[j] = 1;
				}
				sum += point[j];
			}
			System.out.println(sum);
		}

	}
}
