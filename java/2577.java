import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int n[] = new int[10];
		int a = A * B * C;
		
        while (a > 0) {
            n[a % 10]++;
            a /= 10;
        }
         
        for (int i = 0; i < n.length; ++i) {
            System.out.println(n[i]);
        }

	}
}
