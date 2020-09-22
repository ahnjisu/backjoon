import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if (H >= 1 && M < 45) {
			H = H - 1;
			M = M + 15;
		} 
		else if (H < 1 && M < 45) {
			H = H + 23;
			M = M + 15;
		}
		else if (M >= 45 && M <= 59)
			M = M - 45;

		System.out.print(H + " " + M);
	}

}
