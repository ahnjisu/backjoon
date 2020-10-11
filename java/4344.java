import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int C = scanner.nextInt();
		int student[] = new int[C];
		int sum[] = new int[C];
		double avg[] = new double[C];
		double per[] = new double[C];

		for (int i = 0; i < C; i++) {
			student[i] = scanner.nextInt();
			int grade[] = new int[student[i]];
			for (int j = 0; j < student[i]; j++) {
				grade[j] = scanner.nextInt();
				sum[i] += grade[j];
			}
			avg[i] = sum[i] / student[i];
			for (int j = 0; j < student[i]; j++) {
				if (grade[j] > avg[i])
					per[i]++;
			}
		}
		for (int i = 0; i < C; i++) {
			System.out.println(String.format("%.3f", per[i] / student[i] * 100) + "%");

		}

	}
}
